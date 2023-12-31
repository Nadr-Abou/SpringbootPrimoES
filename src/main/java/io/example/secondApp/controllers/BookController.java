package io.example.secondApp.controllers;

import io.example.secondApp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("book/")
    public String getBooks(Model model){
        System.out.println("sono in getBooks");
        model.addAttribute("books",bookService.findAll());
        return "book/books";
    }

    @RequestMapping("book/firstBook")
    public String getFirstBook(Model model){
        System.out.println("sono in getBooks");
        model.addAttribute("book",bookService.getFirstBook());
        return "book/firstBook";
    }
    @RequestMapping(path = "book/bookbyid/{idBook}")
    public ModelAndView getBookByID(@PathVariable(value = "idBook") long idBook){
        ModelAndView modelAndView = new ModelAndView("book/bookById");
        modelAndView.addObject("book",bookService.getByID(idBook));
        return modelAndView;
    }

}
