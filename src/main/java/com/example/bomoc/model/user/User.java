package com.example.bomoc.model.user;

import com.example.bomoc.model.user.asset.Asset;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserID", referencedColumnName = "ID")
	private Account account;

	@OneToOne(mappedBy = "user")
	private Name name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserID", referencedColumnName = "ID")
	private Address address;

	@OneToMany(mappedBy = "user")
	List<Asset> assets;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String email;
	private String phoneNumber;
	private LocalDateTime dateOfBirth;
	private boolean isAdmin;
	private String description;

}