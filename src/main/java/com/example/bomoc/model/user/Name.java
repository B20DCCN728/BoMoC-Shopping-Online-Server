package com.example.bomoc.model.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "name")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Name {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserID", referencedColumnName = "ID")
	private User user;

	@Id
	@Column(name = "ID")
	private int ID;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "MiddleName")
	private String middleName;
	@Column(name = "LastName")
	private String lastName;

}