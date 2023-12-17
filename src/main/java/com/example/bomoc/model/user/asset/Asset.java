package com.example.bomoc.model.user.asset;

import com.example.bomoc.model.Payment;
import com.example.bomoc.model.user.User;
import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "asset")
public class Asset {

	@ManyToOne
	@JoinColumn(name = "UserID", referencedColumnName = "ID")
	User user;

//	List<Payment> payments;

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