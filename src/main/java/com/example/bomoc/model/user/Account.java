package com.example.bomoc.model.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserID", referencedColumnName = "ID")
	User user;

	@Id
	@Column(name = "ID")
	private int ID;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;

}