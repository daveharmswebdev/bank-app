package com.dave.loans.repository;

import com.dave.loans.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 3/12/22
 * Time: 4:15 PM
 */
@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {
    List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);
}
