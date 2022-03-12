package com.dave.cards.repository;

import com.dave.cards.model.Cards;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 3/12/22
 * Time: 1:37 PM
 */
@Repository
public interface CardsRepository extends CrudRepository<Cards, Long> {

    List<Cards> findByCustomerId(int customerId);
}
