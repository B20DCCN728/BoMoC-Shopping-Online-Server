package com.example.bomoc.model.user;

import com.example.bomoc.model.Cart;
import com.example.bomoc.model.FeedBack;
import jakarta.persistence.Column;

import java.util.*;

public class Customer extends User {
//	private List<FeedBack> feedBack;
//	private List<Cart> cart;

	@Column(name = "loyaltyPoints")
	private int loyaltyPoints;
	@Column(name = "isVIP")
	private int isVIP;

}