package com.example.bomoc.model.order;

import com.example.bomoc.model.order.Cart;
import com.example.bomoc.model.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Item")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

	@OneToOne(mappedBy = "items", cascade = CascadeType.ALL)
	private Cart cart;

	@ManyToOne(
			fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.ALL,
			targetEntity = Product.class
	)
	@JoinColumn(
			name = "ProductID",
			referencedColumnName = "ID"
	)
	private Product product;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;
	@Column(name = "Price")
	private double price;
	@Column(name = "Quantity")
	private int quantity;

}