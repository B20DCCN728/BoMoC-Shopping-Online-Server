package com.example.bomoc.model.product.mobilephone;

import com.example.bomoc.model.product.mobilephone.MobilePhone;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Table(name = "Phonecategory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneCategory {

	@ManyToMany(mappedBy = "phoneCategories")
	private List<MobilePhone> mobilePhones;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private int ID;
	@Column(name = "Name", nullable = false)
	private String name;

}