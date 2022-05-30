package com.example.capitalBank.controller;

import com.example.capitalBank.model.Account;
import com.example.capitalBank.model.Payment;
import com.example.capitalBank.model.SavingsAccount;
import com.example.capitalBank.model.User;
import com.example.capitalBank.service.TransactionService;
import com.example.capitalBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/transfer")
public class TransferController {
    @Autowired
    private TransactionService transactionService;

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/betweenAccounts", method = RequestMethod.GET)
    public String betweenAccounts(Model model) {
        model.addAttribute("transferFrom", "");
        model.addAttribute("transferTo", "");
        model.addAttribute("amount", "");

        return "betweenAccounts";
    }
    @RequestMapping(value = "/betweenAccounts", method = RequestMethod.POST)
    public String betweenAccountsPost(
            @ModelAttribute("transferFrom") String transferFrom,
            @ModelAttribute("transferTo") String transferTo,
            @ModelAttribute("amount") String amount,
            Principal principal
    ) throws Exception {
        User user = userService.findByUsername(principal.getName());
        Account account = user.getPrimaryAccount();
        SavingsAccount savingsAccount = user.getSavingsAccount();
        transactionService.betweenAccountsTransfer(transferFrom, transferTo, amount, account, savingsAccount);

        return "redirect:/userFront";
    }
    @RequestMapping(value = "/recipient", method = RequestMethod.GET)
    public String recipient(Model model, Principal principal) {
        List<Payment> paymentList = transactionService.findRecipientList(principal);

        Payment payment = new Payment();

        model.addAttribute("paymentList", paymentList);
        model.addAttribute("payment", payment);

        return "payment";
    }
    @RequestMapping(value = "/payment/save", method = RequestMethod.POST)
    public String recipientPost(@ModelAttribute("payment") Payment payment, Principal principal) {

        User user = userService.findByUsername(principal.getName());
        payment.setUser(user);
        transactionService.saveRecipient(payment);

        return "redirect:/transfer/payment";
    }
    @RequestMapping(value = "/recipient/edit", method = RequestMethod.GET)
    public String recipientEdit(@RequestParam(value = "recipientName") String recipientName, Model model, Principal principal){

        Payment payment = transactionService.findRecipientByName(recipientName);
        List<Payment> paymentList = transactionService.findRecipientList(principal);

        model.addAttribute("paymentList", paymentList);
        model.addAttribute("payment", payment);

        return "payment";
    }
    @RequestMapping(value = "/recipient/delete", method = RequestMethod.GET)
    @Transactional
    public String recipientDelete(@RequestParam(value = "recipientName") String recipientName, Model model, Principal principal){

        transactionService.deleteRecipientByName(recipientName);

        List<Payment> paymentList = transactionService.findRecipientList(principal);

        Payment payment = new Payment();
        model.addAttribute("payment", payment);
        model.addAttribute("paymentList", paymentList);


        return "payment";
    }
    @RequestMapping(value = "/toSomeoneElse",method = RequestMethod.GET)
    public String toSomeoneElse(Model model, Principal principal) {
        List<Payment> paymentList = transactionService.findRecipientList(principal);

        model.addAttribute("paymentList", paymentList);
        model.addAttribute("accountType", "");

        return "toSomeoneElse";
    }
    @RequestMapping(value = "/toSomeoneElse",method = RequestMethod.POST)
    public String toSomeoneElsePost(@ModelAttribute("recipientName") String recipientName, @ModelAttribute("accountType") String accountType, @ModelAttribute("amount") String amount, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        Payment payment = transactionService.findRecipientByName(recipientName);
        transactionService.toSomeoneElseTransfer(payment, accountType, amount, user.getPrimaryAccount(), user.getSavingsAccount());

        return "redirect:/userFront";
    }


}
