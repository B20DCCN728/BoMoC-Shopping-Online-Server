package com.example.bomoc.controller;

import com.example.bomoc.model.product.Product;
import com.example.bomoc.model.product.book.Book;
import com.example.bomoc.model.response.ResponseObject;
import com.example.bomoc.service.productdao.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*") // Allow all origins to access this API
@RestController
@RequestMapping(path = "/api/product")
public class ProductController {

    @Autowired
    private BookService productService;

    @GetMapping("/getAllBooks")
    public ResponseEntity<ResponseObject> getAllBooks() {
        List<Book> books = productService.getAllBooks();
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
        Book newBook = productService.createProduct(book);
        return ResponseEntity.ok(
                new ResponseObject(
                        "200",
                        "Create product successfully",
                        newBook
                )
        );
    }

}
