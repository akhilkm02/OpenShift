package com.pdp.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PdpController {
    @GetMapping("/greeting")
    public String getGreetings(){
        return "Have a good day !";
    }
}
