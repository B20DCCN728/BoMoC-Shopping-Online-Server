package com.example.bomoc.model.order.shipment;

import com.example.bomoc.model.order.Order;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Shipment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shipment {

	@OneToOne()
	Order order;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;
	@Column(name = "Cost")
	private double cost;
	@Column(name = "Description")
	private String description;
	@Column(name = "TrackingNumber")
	private int trackingNumber;
	@Column(name = "ShippingDate")
	private LocalDateTime shippingDate;
	@Column(name = "DeliveryDate")
	private LocalDateTime deliveryDate;
	@Column(name = "Status")
	private String status;
	@Column(name = "Carrier")
	private String carrier;
	@Column(name = "OriginAddress")
	private String originAddress;
	@Column(name = "DestinationAddress")
	private String destinationAddress;

}