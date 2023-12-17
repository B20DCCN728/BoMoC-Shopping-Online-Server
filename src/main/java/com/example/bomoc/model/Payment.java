package com.example.bomoc.model;

import com.example.bomoc.model.user.asset.Asset;

import java.time.LocalDateTime;

public class Payment {

	Asset asset;
	Order order;
	private int ID;
	private double amount;
	private String currency;
	private String status;
	private String note;
	private LocalDateTime timeStamp;
	private String paymentType;

}