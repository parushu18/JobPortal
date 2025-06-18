package com.codewithram.mystore.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller to handle requests for the home page and general navigation.
 */

@Controller
public class HomeController {

    @GetMapping({"", "/"})
    public String home() {
        return "index";  // Maps to index.html or index.jsp in templates
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";  // Maps to contact.html or contact.jsp in templates
    }
}