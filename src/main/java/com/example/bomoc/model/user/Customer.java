package com.example.bomoc.model.user;

import com.example.bomoc.model.Cart;
import com.example.bomoc.model.FeedBack;

import java.util.*;

public class Customer extends User {
	List<FeedBack> feedBack;
	List<Cart> cart;
	private int loyaltyPoints;
	private boolean isVIP;

}