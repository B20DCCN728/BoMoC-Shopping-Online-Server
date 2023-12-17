package com.example.bomoc.model.user;

import com.example.bomoc.model.Publisher;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Table(name = "address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	@OneToMany(mappedBy = "address")
	List<User> users;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "PublisherID")
	private int publisherID;
	@Column(name = "HouseNumber")
	private String houseNumber;
	@Column(name = "Street")
	private String street;
	@Column(name = "District")
	private String district;
	@Column(name = "City")
	private String city;

}