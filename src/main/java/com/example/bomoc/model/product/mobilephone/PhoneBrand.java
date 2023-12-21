package com.example.bomoc.model.product.mobilephone;

import com.example.bomoc.model.product.mobilephone.MobilePhone;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "PhoneBrand")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneBrand {

	@OneToMany(mappedBy = "phoneBrand", cascade = CascadeType.ALL)
	private List<MobilePhone> mobilePhones;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private int ID;
	@Column(name = "BrandName", nullable = false)
	private String brandName;
	@Column(name = "Country", nullable = false)
	private String country;
	@Column(name = "YearEstablished", nullable = false)
	private LocalDateTime yearEstablished;
	@Column(name = "Attribute", nullable = false)
	private int attribute;

}