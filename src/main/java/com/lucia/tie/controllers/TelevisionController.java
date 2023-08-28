package com.lucia.tie.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TelevisionController {
    private String currentTelevisionDetails; // this still has to be initialized // have to be made in an extra class I think //
    private long id; //has to be initialized as well //

    @GetMapping("/getTelevision")
    // defining a single endpoint using @GetMapping annotation with the path getTelevision - when a get request is made to this endpoint the getTelevision will be executed.
    public ResponseEntity<String> getTelevision(String television) {
        return ResponseEntity.ok(television); // the ResponseEntity.ok(television) call creates a response with an HTTP status of 200 OK and includes television as the response body
    }

    @GetMapping("/getAllTelevisions")
    public ResponseEntity<List<String>> getAllTelevisions(List<String> allTelevisions) {
        return ResponseEntity.ok(allTelevisions);

    }

    @PostMapping("/postTelevision")
    public ResponseEntity<String> postTelevision(String television) {
        return ResponseEntity.created(null).body(television);
    }

    @PostMapping("/postAllTelevisions")
    public ResponseEntity<List<String>> postAllTelevisions(List<String> allTelevisions) {
        return ResponseEntity.created(null).body(allTelevisions);
    }

    @PutMapping("/update/id")
    public ResponseEntity<String> putTelevision(@PathVariable long id, @RequestBody String updatedTelevisionDetails) {
        currentTelevisionDetails = updatedTelevisionDetails; // updated details replace current details //
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTelevision(@PathVariable long id, @RequestBody String deletedTelevision) {

        return ResponseEntity.noContent().build();
    }
}

// notes: maybe better to change updated and deteledTelevision into general television ?? //

