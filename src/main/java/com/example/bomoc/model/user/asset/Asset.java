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
	private int ID;
	private String symbol;
	private double balance;
	private String note;
	private String assetType;

}