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

	@OneToOne(mappedBy = "name")
	User user;

	@Id
	private int ID;
	private String firstName;
	private String middleName;
	private String lastName;

}