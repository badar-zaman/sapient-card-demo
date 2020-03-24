package com.card.service;

import java.util.List;

import com.card.model.Card;
import com.card.model.CardDto;

public interface CardService {

    List<Card> findAll();
    Card save(CardDto contact);

}
