package com.example.bomoc.model.user;

import com.example.bomoc.model.user.asset.Asset;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

	@OneToOne(mappedBy = "user")
	@JsonIgnore
	private Account account;

	@OneToOne(mappedBy = "user")
	@JsonIgnore
	private Name name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	@JoinColumn(name = "AddressID", referencedColumnName = "ID")
	private Address address;

	@OneToMany(mappedBy = "user")
	@JsonManagedReference
	List<Asset> assets;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "Email", unique = true)
	private String email;
	@Column(name = "PhoneNumber", unique = true)
	private String phoneNumber;
	@Column(name = "DateOfBirth")
	private LocalDateTime dateOfBirth;
	@Column(name = "IsAdmin")
	private int isAdmin;
	@Column(name = "Description")
	private String description;

}