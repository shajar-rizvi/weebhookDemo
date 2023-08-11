package com.example.webhook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhook")
public class WebhoController {

    @PostMapping
    public ResponseEntity<Object> WebNotification(@RequestBody Object requestBody){
        System.out.println("*****   Web Hook Notification   *****" + requestBody);
        return new ResponseEntity<Object>(requestBody, HttpStatus.OK);
    }
    @PostMapping("/abc")
    public ResponseEntity<String> WebNotification(){
        System.out.println("*****   Web Hook Notification   *****" );
        return new ResponseEntity<String>("Running", HttpStatus.OK);
    }
}
