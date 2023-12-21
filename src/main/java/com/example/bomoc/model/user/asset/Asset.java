package com.example.bomoc.model.user.asset;

import com.example.bomoc.model.order.payment.Payment;
import com.example.bomoc.model.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "asset")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asset {

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "UserID", referencedColumnName = "ID")
	private User user;

	@OneToMany(mappedBy = "asset", cascade = CascadeType.ALL)
	private List<Payment> payments;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;
	@Column(name = "Symbol")
	private String symbol;
	@Column(name = "Balance")
	private double balance;
	@Column(name = "Note")
	private String note;
	@Column(name = "AssetType")
	private String assetType;

}