package io.example.secondApp.controllers;

import io.example.secondApp.services.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {
    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @RequestMapping("/firstPublisher")
    String getFirstPublisher(Model model){
        model.addAttribute("firstPublisher",publisherService.getFirstPublisher());
        return "firstPublisher";
    }
}
