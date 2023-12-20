package com.example.bomoc.controller;

import com.example.bomoc.model.product.book.Book;
import com.example.bomoc.model.response.ResponseObject;
import com.example.bomoc.service.productdao.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*") // Allow all origins to access this API
@RestController
@RequestMapping(path = "/api/product")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getAllBooks")
    public ResponseEntity<ResponseObject> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(
                new ResponseObject(
                        "200",
                        "Get all products successfully",
                        books
                )
        );
    }

    @PostMapping("/createBook")
    public ResponseEntity<ResponseObject> createBook(@RequestBody Book book) {
        Book newBook = bookService.createProduct(book);
        return ResponseEntity.ok(
                new ResponseObject(
                        "200",
                        "Create product successfully",
                        newBook
                )
        );
    }

    @GetMapping("/product-detail/{ID}")
    public ResponseEntity<ResponseObject> getBook(@PathVariable("ID") Book book) {
        Optional<Book> bookOptional = bookService.getBook(book);
        return bookOptional.map(value -> ResponseEntity.ok(
                new ResponseObject(
                        "200",
                        "Get product successfully",
                        value
                )
        )).orElseGet(() -> ResponseEntity.ok(
                new ResponseObject(
                        "404",
                        "Product not found",
                        null
                )
        ));
    }

}
