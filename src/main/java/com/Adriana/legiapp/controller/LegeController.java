package com.Adriana.legiapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegeController {

    @GetMapping("/api/legi")
    public String getLegi() {
        return "Die Liste der Gesetze folgt hier ";
    }
}
