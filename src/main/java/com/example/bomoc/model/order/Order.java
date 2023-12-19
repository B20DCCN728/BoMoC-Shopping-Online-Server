package com.example.bomoc.model.order;

import com.example.bomoc.model.order.payment.Payment;
import com.example.bomoc.model.order.shipment.Shipment;

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