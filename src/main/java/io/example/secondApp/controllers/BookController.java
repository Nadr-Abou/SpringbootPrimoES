package io.example.secondApp.controllers;

import io.example.secondApp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        System.out.println("sono in getBooks");
        model.addAttribute("books",bookService.findAll());
        return "books";
    }
}
