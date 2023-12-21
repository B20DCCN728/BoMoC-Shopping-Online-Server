package com.example.bomoc.model.order.payment;

import com.example.bomoc.model.order.payment.Payment;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PayCard extends Payment {

	@Column(name = "PayerCardNumber")
	private String payerCardNumber;

}