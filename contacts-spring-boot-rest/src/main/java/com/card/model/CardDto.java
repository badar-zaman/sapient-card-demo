package com.card.model;



public class CardDto {
	
	private int id;
	private String name;
	private Integer cardNumber;
	private Integer limit;
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
	 * @return the firstName
	 */
	public String getName() {
		return name;
	}
	/**+
	 * @param name the firstName to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the emailAddress
	 */
	public Integer getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param cardNumber the emailAddress to set
	 */
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * @return the telephoneNumber
	 */
	public Integer getLimit() {
		return limit;
	}
	/**
	 * @param limit the telephoneNumber to set
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	/**
	 * @return the address1
	 */
	public Integer getBalance() {
		return balance;
	}
	/**
	 * @param balance the address1 to set
	 */
	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CardDto{" +
				"id=" + id +
				", name='" + name + '\'' +
				", cardNumber=" + cardNumber +
				", limit=" + limit +
				", balance=" + balance +
				'}';
	}
}
