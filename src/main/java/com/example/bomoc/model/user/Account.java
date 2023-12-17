package com.example.bomoc.model.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
	@JsonBackReference
	@JoinColumn(name = "UserID", referencedColumnName = "ID")
	private User user;

	@Id
	@Column(name = "ID")
	private int ID;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;

}