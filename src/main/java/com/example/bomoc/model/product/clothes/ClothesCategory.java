package com.example.bomoc.model.product.clothes;

import com.example.bomoc.model.product.clothes.Clothes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Table(name = "clothescategory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClothesCategory {
	@ManyToMany(mappedBy = "clothesCategories")
	private List<Clothes> clotheses;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private int ID;
	@Column(name = "Name", nullable = false)
	private String name;
	@Column(name = "Description")
	private String description;

}