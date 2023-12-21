package com.example.bomoc.model.order.payment;

import com.example.bomoc.model.order.payment.Payment;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;

@Entity
@Inheritance
@
public class PayCrypto extends Payment {

	private String transactionHash;
	private String payerWalletAddress;

}