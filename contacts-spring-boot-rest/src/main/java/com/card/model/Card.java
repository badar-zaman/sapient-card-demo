package com.card.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String Name;

	@Column(name = "cardNumber")
	private Integer cardNumber;

	@Column(name = "cardLimit")
	private Integer cardLimit;

	@Column(name = "balance")
	private Integer balance;


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the Name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param Name the Name to set
	 */
	public void setName(String Name) {
		this.Name = Name;
	}

	/**
	 * @return the cardNumber
	 */
	public Integer getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param  cardNumber to set
	 */
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the emailAddress
	 */
	public Integer getCardLimit() {
		return cardLimit;
	}

	/**
	 * @param cardLimit the emailAddress to set
	 */
	public void setCardLimit(Integer cardLimit) {
		this.cardLimit = cardLimit;
	}

	/**
	 * @return the telephoneNumber
	 */
	public Integer getBalance() {
		return balance;
	}

	/**
	 * @param balance the telephoneNumber to set
	 */
	public void setBalance(Integer balance) {
		this.balance = balance;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Card card = (Card) o;
		return id == card.id &&
				cardLimit == card.cardLimit &&
				balance == card.balance &&
				Objects.equals(Name, card.Name) &&
				Objects.equals(cardNumber, card.cardNumber);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, Name, cardNumber, cardLimit, balance);
	}

	@Override
	public String toString() {
		return "Card{" +
				"id=" + id +
				", Name='" + Name + '\'' +
				", cardNumber=" + cardNumber +
				", cardLimit=" + cardLimit +
				", balance=" + balance +
				'}';
	}
}
