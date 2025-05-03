package com.pdp.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("productName", "Samsung Galaxy S23");
        model.addAttribute("imageUrl", "https://example.com/s23.jpg");
        model.addAttribute("description", "6.1\" AMOLED, Snapdragon 8 Gen 2, 50MP Camera");
        model.addAttribute("price", "74,999");
        return "index"; // Refers to templates/index.html
    }
}
