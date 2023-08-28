package com.lucia.tie.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionController {
    @PostMapping("/television")
    public String postTelevision(@RequestBody Television television) {
        System.out.println(television.getTelevisionName());
        return "The TV you have chosen is " + " " + television.getTelevisionName() + ".";
    }

}


