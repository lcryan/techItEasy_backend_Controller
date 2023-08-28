package com.lucia.tie.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TelevisionController {
    @GetMapping("/getTelevision")
    // defining a single endpoint using @GetMapping annotation with the path getTelevision - when a get request is made to this endpoint the getTelevision will be executed.
    public ResponseEntity<String> getTelevision() {
        String television = "television"; // creating a string here with the value of television // why ?
        return ResponseEntity.ok(television); // the ResponseEntity.ok(television) call creates a response with an HTTP status of 200 OK and includes the "television" String as the response body" - couldn't return only television without making a variable here - my guess is that you have to save the new information somewhere?
    }

    @GetMapping("/getAllTelevisions")
    public ResponseEntity<List<String>> getAllTelevisions() {
        List<String> allTelevisions = new ArrayList<>();
        allTelevisions.add("Samsung 890723734"); //question here is where we get the ArrayList from ??? Do we have to make this list in postman ??? //
        allTelevisions.add("Sony - BB890"); // example for television //
        allTelevisions.add("LG - 8890978");

        return ResponseEntity.ok(allTelevisions);

    }
}


