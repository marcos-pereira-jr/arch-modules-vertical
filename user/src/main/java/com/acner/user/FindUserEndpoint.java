package com.acner.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/{id}")
public class FindUserEndpoint {
    @GetMapping
    public ResponseEntity<String> execute(@PathVariable("id") String id){
        return ResponseEntity.ok("Id ".concat(id));
    }
}
