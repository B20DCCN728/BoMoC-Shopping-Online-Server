package com.example.bomoc.service.productdao;

import com.example.bomoc.model.product.Product;
import com.example.bomoc.model.product.book.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book createProduct(Book book);
}