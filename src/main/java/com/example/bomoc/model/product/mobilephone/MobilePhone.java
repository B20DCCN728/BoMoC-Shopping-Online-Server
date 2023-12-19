package com.example.bomoc.model.product.mobilephone;

import com.example.bomoc.model.product.Product;

import java.time.LocalDateTime;
import java.util.*;

public class MobilePhone extends Product {

	PhoneBrand phoneBrand;
	Collection<PhoneCategory> phoneCategories;
	private String model;
	private int storageCapacity;
	private String color;
	private boolean availability;
	private LocalDateTime releaseYear;

}