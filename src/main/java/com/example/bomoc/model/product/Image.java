package com.example.bomoc.model.product;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "image")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {

	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ProductID", referencedColumnName = "ID")
	private Product product;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "Name", nullable = false)
	private String name;
	@Column(name = "PathFile", nullable = false)
	private String pathFile;

}