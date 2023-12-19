package com.example.bomoc.service.productdao;

import com.example.bomoc.model.product.Product;
import com.example.bomoc.model.product.book.Book;
import com.example.bomoc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookImpl implements BookService {

    @Autowired
    private BookRepository productRepository;

    @Override
    public List<Book> getAllBooks() {
        return productRepository.findAll();
    }

    @Override
    public Book createProduct(Book book) {
        return productRepository.save(book);
    }

}