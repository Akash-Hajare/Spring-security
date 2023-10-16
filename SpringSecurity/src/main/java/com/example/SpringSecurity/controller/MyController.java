package com.example.SpringSecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class MyController {

    @PreAuthorize("hasRole('NORMAL')")
    @GetMapping("/normal")
    public ResponseEntity<String> normalMethod(){
        return  ResponseEntity.ok("Im normal method");
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public ResponseEntity<String> adminMethod(){
        return  ResponseEntity.ok("Im admin method");
    }


    @GetMapping("/public")
    public ResponseEntity<String> publicMethod(){
        return  ResponseEntity.ok("Im public method");
    }
}
