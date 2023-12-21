package com.example.bomoc.model.order;

import com.example.bomoc.model.order.payment.Payment;
import com.example.bomoc.model.order.shipment.Shipment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	Shipment shipment;

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	Payment payment;

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	Cart cart;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;
	@Column(name = "TotalAmount")
	private double totalAmount;
	@Column(name = "Status")
	private String status;
	@Column(name = "TimeStamp")
	private LocalDateTime timeStamp;

}