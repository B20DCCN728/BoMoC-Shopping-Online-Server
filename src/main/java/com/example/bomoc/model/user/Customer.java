package com.example.bomoc.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Customer extends User {
//	private List<FeedBack> feedBack;
//	private List<Cart> cart;

	@Column(name = "loyaltyPoints")
	private int loyaltyPoints;
	@Column(name = "isVIP")
	private int isVIP;

}