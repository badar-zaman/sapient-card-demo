package com.card.service.impl;

import com.card.model.Card;
import com.card.model.CardDto;
import com.card.repository.CardRepository;
import com.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "contactService")
public class CardServiceImpl implements CardService {
	
	@Autowired
	private CardRepository cardDao;

	public List<Card> findAll() {
		List<Card> list = new ArrayList<>();
		cardDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}


	@Override
    public Card save(CardDto card) {
		Card newCard = new Card();
		newCard.setName(card.getName());
		newCard.setCardNumber(card.getCardNumber());
		newCard.setCardLimit(card.getLimit());
		newCard.setBalance(0);
		return cardDao.save(newCard);
    }
	
}
