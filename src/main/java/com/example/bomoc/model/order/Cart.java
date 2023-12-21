package com.example.bomoc.model.order;

import com.example.bomoc.model.user.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cart")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

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

	@OneToOne(mappedBy = "cart")
	private Customer customer;

	@OneToOne(
			fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.ALL,
			targetEntity = Item.class
	)
	@JoinColumn(
			name = "ItemID",
			referencedColumnName = "ID"
	)
	private Item items;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;
	@Column(name = "TotalAmount")
	private double totalAmount;

}