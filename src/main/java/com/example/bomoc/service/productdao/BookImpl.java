package com.example.bomoc.service.productdao;

import com.example.bomoc.model.product.Product;
import com.example.bomoc.model.product.book.Book;
import com.example.bomoc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBook(Book book) {
        return bookRepository.findById(book.getID());
    }

    @Override
    public Book createProduct(Book book) {
        return bookRepository.save(book);
    }

}