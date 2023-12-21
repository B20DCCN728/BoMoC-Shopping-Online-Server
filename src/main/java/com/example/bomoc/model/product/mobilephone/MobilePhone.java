package com.example.bomoc.model.product.mobilephone;

import com.example.bomoc.model.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@DiscriminatorValue("M")
public class MobilePhone extends Product {

	@ManyToOne(
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
			optional = false,
			targetEntity = PhoneBrand.class
	)
	@JoinColumn(name = "PhoneBrandID", referencedColumnName = "ID")
	private PhoneBrand phoneBrand;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "Product_Phonecategory",
			joinColumns = @JoinColumn(name = "ProductID"),
			inverseJoinColumns = @JoinColumn(name = "PhoneCategory ID")
	)
	private List<PhoneCategory> phoneCategories;

	@Column(name = "Model", nullable = false)
	private String model;
	@Column(name = "StorageCapacity", nullable = false)
	private int storageCapacity;
	@Column(name = "Color", nullable = false)
	private String color;
	@Column(name = "Availability", nullable = false)
	private boolean availability;
	@Column(name = "ReleaseYear", nullable = false)
	private LocalDateTime releaseYear;

}