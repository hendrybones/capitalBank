package com.example.capitalBank.controller;

import com.example.capitalBank.model.*;
import com.example.capitalBank.repository.AccountRepo;
import com.example.capitalBank.service.AccountService;
import com.example.capitalBank.service.TransactionService;
import com.example.capitalBank.service.UserService;
import com.example.capitalBank.util.GenAccountNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountRepo accountRepository;

    @PostMapping("/create_account")
    public String createAccount(@RequestParam("account_name")String accountName,
                                @RequestParam("account_type")String accountType,
                                RedirectAttributes redirectAttributes,
                                HttpSession session){

        // TODO: CHECK FOR EMPTY STRINGS:
        if(accountName.isEmpty() || accountType.isEmpty()){
            redirectAttributes.addFlashAttribute("error", "Account Name and Type Cannot be Empty!");
            return "redirect:/app/dashboard";
        }

        // TODO: GET LOGGED IN USER:
        User user = (User)session.getAttribute("user");

        // TODO: GET / GENERATE ACCOUNT NUMBER:
        int setAccountNumber = GenAccountNumber.generateAccountNumber();
        String bankAccountNumber = Integer.toString(setAccountNumber);

        // TODO: CREATE ACCOUNT:
        accountRepository.createBankAccount(user.getUser_id(), bankAccountNumber, accountName, accountType );

        // Set Success message:
        redirectAttributes.addFlashAttribute("success", "Account Created Successfully!");
        return "redirect:/app/dashboard";

    }
}
