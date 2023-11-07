package io.example.secondApp.controllers;

import io.example.secondApp.services.AuthorService;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


}
