package com.example.bomoc.model.product.book;

import com.example.bomoc.model.product.book.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Table(name = "bookcategory")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookCategory {

	@ManyToMany(mappedBy = "bookCategories")
	private List<Book> books;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private int ID;
	@Column(name = "Name", nullable = false)
	private String name;
	@Column(name = "Description")
	private String description;

}