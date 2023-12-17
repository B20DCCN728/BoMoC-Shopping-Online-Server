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
	private int publisherID;
	private String houseNumber;
	private String street;
	private String district;
	private String city;

}