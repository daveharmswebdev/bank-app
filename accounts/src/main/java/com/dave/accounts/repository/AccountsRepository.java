package com.dave.accounts.repository;

import com.dave.accounts.model.Accounts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * User: Dave Harms
 * Date: 3/12/22
 * Time: 1:07 PM
 */
@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {

    Accounts findByCustomerId(int customerId);

}
