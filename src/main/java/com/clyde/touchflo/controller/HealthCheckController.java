package com.clyde.touchflo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping
public class HealthCheckController {

    @GetMapping("/")
    public ResponseEntity<String> welcome() {
        log.info("[GET] welcome");
        return ResponseEntity.ok("GET-welcome");
    }


    @GetMapping("/health")
    public ResponseEntity<String> getHealthCheck() {
        log.info("[GET] health-check");
        return ResponseEntity.ok("GET-ok");
    }

    @PostMapping("/health")
    public ResponseEntity<String> postHealthCheck() {
        log.info("[POST] health-check");
        return ResponseEntity.ok("POST-ok");
    }

    @PutMapping("/health")
    public ResponseEntity<String> putHealthCheck() {
        log.info("[PUT] health-check");
        return ResponseEntity.ok("PUT-ok");
    }
    @DeleteMapping("/health")
    public ResponseEntity<String> deleteHealthCheck() {
        log.info("[DELETE] health-check");
        return ResponseEntity.ok("DELETE-ok");
    }



}
