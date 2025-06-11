package com.practice.one.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testControler {
    @GetMapping("/test")
    public String testRoute() {
        return "test rout is hitted";
    }

}
