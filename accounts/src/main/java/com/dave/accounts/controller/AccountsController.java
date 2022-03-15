package com.dave.accounts.controller;

import com.dave.accounts.config.AccountsServiceConfig;
import com.dave.accounts.model.Accounts;
import com.dave.accounts.model.Customer;
import com.dave.accounts.model.Properties;
import com.dave.accounts.repository.AccountsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.web.bind.annotation.GetMapping;
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

    private final AccountsServiceConfig accountsServiceConfig;

    public AccountsController(AccountsRepository accountsRepository, AccountsServiceConfig accountsServiceConfig) {
        this.accountsRepository = accountsRepository;
        this.accountsServiceConfig = accountsServiceConfig;
    }

    @PostMapping("myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        return accountsRepository.findByCustomerId(customer.getCustomerId());
    }

    @GetMapping("/accounts/properties")
    public String getPropertyDetails() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(accountsServiceConfig.getMsg(), accountsServiceConfig.getBuildVersion(),
                accountsServiceConfig.getMailDetails(), accountsServiceConfig.getActiveBranches());

        return ow.writeValueAsString(properties);
    }
}
    

