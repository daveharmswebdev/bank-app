package com.dave.accounts.controller;

import com.dave.accounts.model.Accounts;
import com.dave.accounts.model.Customer;
import com.dave.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Dave Harms
 * Date: 3/12/22
 * Time: 12:55 PM
 */
@RestController
class AccountsController {

    private final AccountsRepository accountsRepository;

    public AccountsController(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    @PostMapping("myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        return accountsRepository.findByCustomerId(customer.getCustomerId());
    }
}
