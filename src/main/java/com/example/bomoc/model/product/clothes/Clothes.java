package com.example.bomoc.model.product.clothes;

import com.example.bomoc.model.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@DiscriminatorValue("C")
public class Clothes extends Product {

	@ManyToOne(
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL,
			optional = false,
			targetEntity = ClothesBrand.class
	)
	@JoinColumn(name = "ClothesBrandID", referencedColumnName = "ID")
	private ClothesBrand clothesBrand;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "Product_Clothescategory",
			joinColumns = @JoinColumn(name = "ProductID"),
			inverseJoinColumns = @JoinColumn(name = "ClothesCategoryID")
	)
	private List<ClothesCategory> clothesCategories;

	@Column(name = "Size", nullable = false)
	private String size;
	@Column(name = "Color", nullable = false)
	private String color;
	@Column(name = "Material", nullable = false)
	private String material;
	@Column(name = "Gender", nullable = false)
	private String gender;

}