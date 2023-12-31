package com.example.bomoc.model.user;

import com.example.bomoc.model.order.Cart;
import com.example.bomoc.model.product.feedback.FeedBack;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@DiscriminatorValue("C")
public class Customer extends User {

	@OneToMany(
			mappedBy = "customer",
			cascade = CascadeType.ALL
	)
	private List<FeedBack> feedBack;

	@OneToMany(
			mappedBy = "customer",
			cascade = CascadeType.ALL
	)
	private List<Cart> cart;

	@Column(name = "loyaltyPoints")
	private int loyaltyPoints;
	@Column(name = "isVIP")
	private int isVIP;

}