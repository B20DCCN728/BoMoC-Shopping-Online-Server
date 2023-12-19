package com.example.bomoc.model.user;

import com.example.bomoc.model.product.book.Publisher;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
	@JsonBackReference
	private List<User> users;

	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	@JoinColumn(name = "PublisherID", referencedColumnName = "ID")
	private Publisher publisher;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "HouseNumber")
	private String houseNumber;
	@Column(name = "Street")
	private String street;
	@Column(name = "District")
	private String district;
	@Column(name = "City")
	private String city;

}