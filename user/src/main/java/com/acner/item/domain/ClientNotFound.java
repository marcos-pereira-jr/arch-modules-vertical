package com.acner.item.domain;

public class ClientNotFound extends RuntimeException {
    public ClientNotFound() {
        super("Client Not Found");
    }
}
