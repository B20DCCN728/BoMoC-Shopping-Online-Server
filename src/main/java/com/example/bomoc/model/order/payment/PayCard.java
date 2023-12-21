package com.example.bomoc.model.order.payment;

import com.example.bomoc.model.order.payment.Payment;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue(value = "Card")
public class PayCard extends Payment {

	@Column(name = "PayerCardNumber")
	private String payerCardNumber;

}