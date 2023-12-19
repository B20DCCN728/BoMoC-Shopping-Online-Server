package com.example.bomoc.model.product.book;

import com.example.bomoc.model.product.Product;
import com.example.bomoc.model.user.Address;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Table(name = "publisher")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {

	@JsonBackReference
	@OneToMany(mappedBy = "publisher")
	private List<Book> books;

	@OneToOne(mappedBy = "publisher")
	@JsonBackReference
	private Address address;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "Name")
	private String name;
	@Column(name = "Description")
	private String description;
	@Column(name = "PhoneNumber")
	private String phoneNumber;
	@Column(name = "Email")
	private String email;

}