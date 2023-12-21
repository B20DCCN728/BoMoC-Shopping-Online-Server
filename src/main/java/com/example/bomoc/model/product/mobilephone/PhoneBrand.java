package com.example.bomoc.model.product.mobilephone;

import com.example.bomoc.model.product.mobilephone.MobilePhone;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

	private List<MobilePhone> mobilePhones;
	private int ID;
	private String brandName;
	private String country;
	private LocalDateTime yearEstablished;
	private int attribute;

}