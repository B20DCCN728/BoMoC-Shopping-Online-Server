package com.example.bomoc.model.user.asset;

import com.example.bomoc.model.Payment;
import com.example.bomoc.model.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

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