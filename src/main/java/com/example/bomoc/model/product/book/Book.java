package com.example.bomoc.model.product.book;

import com.example.bomoc.model.product.Product;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@DiscriminatorValue("B")
public class Book extends Product {

//	List<BookCategory> bookCategories;

	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AuthorID", referencedColumnName = "ID")
	private Author author;

	@JsonManagedReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PublisherID", referencedColumnName = "ID")
	private Publisher publisher;

	@Column(name = "Title", nullable = false)
	private String title;
	@Column(name = "Genre", nullable = false)
	private String genre;
	@Column(name = "Availability")
	private boolean availability;
	@Column(name = "Pages", nullable = false)
	private int pages;

}