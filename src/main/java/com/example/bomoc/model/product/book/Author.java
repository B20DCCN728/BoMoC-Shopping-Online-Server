package com.example.bomoc.model.product.book;

import com.example.bomoc.model.product.Product;
import com.example.bomoc.model.product.book.Book;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "author")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

	@JsonBackReference
	@OneToMany(mappedBy = "author")
	private List<Book> books;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "FullName")
	private String fullName;
	@Column(name = "Description")
	private String description;
	@Column(name = "Nationality")
	private String nationality;
	@Column(name = "DateOfBirth")
	private LocalDateTime dateOfBirth;
	@Column(name = "DeathDate")
	private LocalDateTime DeathDate;

}