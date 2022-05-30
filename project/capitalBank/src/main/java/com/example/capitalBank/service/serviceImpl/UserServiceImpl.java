package com.example.capitalBank.service.serviceImpl;

import com.example.capitalBank.model.Role;
import com.example.capitalBank.model.User;
import com.example.capitalBank.repository.RoleRepository;
import com.example.capitalBank.repository.UserRepository;
import com.example.capitalBank.service.AccountService;
import com.example.capitalBank.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class UserServiceImpl  implements UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AccountService accountService;
    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public boolean checkUserExists(String username, String email) {
        return false;
    }

    @Override
    public boolean checkUsernameExists(String username) {
        return false;
    }

    @Override
    public boolean checkEmailExists(String email) {
        return false;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public User createUser(User user, Set<Role> userRoles) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findUserList() {
        return userRepository.findAll();
    }

    @Override
    public void enableUser(String username) {
        User user = findByUsername(username);
        user.setEnabled(true);
        userRepository.save(user);

    }

    @Override
    public void disableUser(String username) {
        User user = findByUsername(username);
        user.setEnabled(false);
        System.out.println(user.isEnabled());
        userRepository.save(user);
        System.out.println(username + " is disabled.");

    }
}
