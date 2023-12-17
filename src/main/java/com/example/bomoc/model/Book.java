package com.example.bomoc.model;

import java.util.*;

public class Book extends Product {

	Collection<BookCategory> bookCategories;
	Author author;
	Publisher publisher;
	private String title;
	private String genre;
	private boolean availability;
	private int pages;

}