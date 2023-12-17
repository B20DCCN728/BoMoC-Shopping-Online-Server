package com.example.bomoc.model;

import java.time.LocalDateTime;

public class Shipment {

	Order order;
	private int ID;
	private double cost;
	private String description;
	private int trackingNumber;
	private LocalDateTime shippingDate;
	private LocalDateTime deliveryDate;
	private String status;
	private String carrier;
	private String originAddress;
	private String destinationAddress;

}