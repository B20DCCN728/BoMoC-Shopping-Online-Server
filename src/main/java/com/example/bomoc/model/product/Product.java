package com.example.bomoc.model.product;

import com.example.bomoc.model.order.Item;
import com.example.bomoc.model.product.feedback.FeedBack;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="discriminator",
		discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue(value="P")
public class Product {

//	private List<FeedBack> feedBack;
//	private List<Item> items;

	@JsonManagedReference
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List <Image> images;

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "Price", nullable = false)
	private double price;
	@Column(name = "Quantity", nullable = false)
	private int quantity;
	@Column(name = "AddedDate", nullable = false)
	private LocalDateTime addedDate;
	@Column(name = "Description")
	private String description;

}