package com.woody.controller;

import com.woody.domain.Account;
import com.woody.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 账户表现层
 */
@Controller("accountController")
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String testFindAll(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("list",accounts);

        return "list";
    }

    @RequestMapping("/save")
    public String testSave(Account account) {
        accountService.saveAccount(account);
        return "success";
    }
}
