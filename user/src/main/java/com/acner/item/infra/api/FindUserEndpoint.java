package com.acner.item.infra.api;

import com.acner.item.application.FindUserUsercase;
import com.acner.item.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/{id}")
public class FindUserEndpoint {
    private final FindUserUsercase usercase;

    @Autowired
    public FindUserEndpoint(FindUserUsercase usercase) {
        this.usercase = usercase;
    }

    public record UserPresentation(String id, String name) {
    }

    @GetMapping
    public ResponseEntity<UserPresentation> execute(@PathVariable("id") String id) {
        Client user = usercase.execute(id);
        return ResponseEntity.ok(new UserPresentation(user.getId(), user.getName()));
    }
}
