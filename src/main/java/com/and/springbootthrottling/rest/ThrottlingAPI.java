package com.and.springbootthrottling.rest;

import com.and.springbootthrottling.service.ThrottlingService;
import com.weddini.throttling.Throttling;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class ThrottlingAPI {

    @Autowired
    private ThrottlingService throttlingService;

    @GetMapping
    @Throttling(limit = 2, timeUnit = TimeUnit.DAYS)
    public ResponseEntity<List<String>> getAll(){
        return ResponseEntity.ok(throttlingService.getAll());
    }

}
