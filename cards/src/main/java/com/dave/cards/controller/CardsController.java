package com.dave.cards.controller;

import com.dave.cards.model.Cards;
import com.dave.cards.model.Customer;
import com.dave.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: Dave Harms
 * Date: 3/12/22
 * Time: 1:38 PM
 */
@RestController
public class CardsController {

    @Autowired
    private CardsRepository cardsRepository;

    @PostMapping("myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer) {
        List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());

        if (cards != null) {
            return cards;
        } else {
            return null;
        }
    }
}
