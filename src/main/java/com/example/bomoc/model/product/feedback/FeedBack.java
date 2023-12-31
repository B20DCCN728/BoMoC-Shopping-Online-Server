package com.example.bomoc.model.product.feedback;

import com.example.bomoc.model.product.Product;
import com.example.bomoc.model.user.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FeedBack")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedBack {

	@OneToOne(mappedBy = "feedBack", cascade = CascadeType.ALL)
	private Rating rating;

	@OneToOne(mappedBy = "feedBack", cascade = CascadeType.ALL)
	private Comment comment;

	@ManyToOne(
			fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.ALL,
			targetEntity = Customer.class
	)
	@JoinColumn(
			name = "UserID",
			referencedColumnName = "ID"
	)
	private Customer customer;

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
	@Column(name = "Note")
	private String note;

}