package com.example.bomoc.model;

import java.time.LocalDateTime;

public class Order {

	Shipment shipment;
	Payment payment;
	Cart cart;
	private int ID;
	private double totalAmount;
	private String status;
	private LocalDateTime timeStamp;

}