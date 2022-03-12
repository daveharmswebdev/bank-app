package com.dave.loans.controller;

import com.dave.loans.model.Customer;
import com.dave.loans.model.Loans;
import com.dave.loans.repository.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 3/12/22
 * Time: 4:17 PM
 */
@RestController
public class LoansController {

    @Autowired
    private LoansRepository loansRepository;

    @PostMapping("/myLoans")
    public List<Loans> getLoansDetails(@RequestBody Customer customer) {
        List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());

        if (loans != null) {
            return loans;
        } else {
            return null;
        }
    }
}
