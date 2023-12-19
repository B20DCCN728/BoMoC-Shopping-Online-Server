package com.example.bomoc.repository;

import com.example.bomoc.model.product.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
