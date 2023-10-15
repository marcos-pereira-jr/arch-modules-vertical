package com.acner.item.application;

import com.acner.item.domain.Client;
import com.acner.item.domain.FindClientService;

import static com.acner.item.domain.Type.USER;

public class FindUserUsercase {
    private final FindClientService service;

    public FindUserUsercase(FindClientService service) {
        this.service = service;
    }

    public Client execute(String id) {
        return service.execute(id, USER);
    }
}
