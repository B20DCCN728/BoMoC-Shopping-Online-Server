package com.example.bomoc.model.user;

import jakarta.persistence.Column;

public class Admin extends User {

	@Column(name = "salary")
	private double salary;
	@Column(name = "admin_role")
	private String adminRole;

}