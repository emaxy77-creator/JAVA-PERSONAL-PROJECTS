package org.example.ecomw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class helloController {

    @GetMapping("/hello")
    public String greet(){
        return "Hello World";
    }


}
