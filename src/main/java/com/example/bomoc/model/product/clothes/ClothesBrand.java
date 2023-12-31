package com.example.bomoc.model.product.clothes;

import com.example.bomoc.model.product.clothes.Clothes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "clothesbrand")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClothesBrand {
	@OneToMany(
			mappedBy = "clothesBrand",
			cascade = CascadeType.ALL
	)
			// orphanRemoval = true
	private List<Clothes> clotheses;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private int ID;
	@Column(name = "BrandName", nullable = false)
	private String brandName;
	@Column(name = "Description")
	private String description;
	@Column(name = "Country")
	private String country;
	@Column(name = "YearEstablished")
	private LocalDateTime yearEstablished;

}