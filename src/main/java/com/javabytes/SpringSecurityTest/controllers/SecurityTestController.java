package com.javabytes.SpringSecurityTest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SecurityTestController {

    @RequestMapping(value = "/home/normal", method = RequestMethod.GET)
    public ResponseEntity<String> regularUsers(){
        return ResponseEntity.ok("I am a normal user");
    }
    @RequestMapping(value = "/home/admin", method = RequestMethod.GET)
    public ResponseEntity<String> adminUsers(){
        return ResponseEntity.ok("I am a admin user");
    }
    @RequestMapping(value = "/home/new", method = RequestMethod.GET)
    public ResponseEntity<String> newUsers(){
        return ResponseEntity.ok("I am a new user");
    }

}
