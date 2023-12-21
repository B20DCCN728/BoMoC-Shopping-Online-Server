package com.example.bomoc.model.order.payment;

import com.example.bomoc.model.order.Order;
import com.example.bomoc.model.user.asset.Asset;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(
		strategy = InheritanceType.SINGLE_TABLE
)
@DiscriminatorColumn(
		name = "Discriminator",
		discriminatorType = DiscriminatorType.STRING
)
@DiscriminatorValue(value = "Payment")
public class Payment {

	@ManyToOne(
			fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.ALL,
			targetEntity = Asset.class
	)
	@JoinColumn(
			name = "AssetID",
			referencedColumnName = "ID"
	)
	private Asset asset;

	@OneToOne(
			fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.ALL,
			targetEntity = Order.class
	)
	@JoinColumn(
			name = "OrderID",
			referencedColumnName = "ID"
	)
	private Order order;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "Amount")
	private double amount;
	@Column(name = "Currency")
	private String currency;
	@Column(name = "Status")
	private String status;
	@Column(name = "Note")
	private String note;
	@Column(name = "TimeStamp")
	private LocalDateTime timeStamp;
	@Column(name = "PaymentType")
	private String paymentType;

}