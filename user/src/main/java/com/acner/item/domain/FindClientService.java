package com.acner.item.domain;

public class FindClientService {
    private final ClientDataSource clientDataSource;

    public FindClientService(ClientDataSource clientDataSource) {
        this.clientDataSource = clientDataSource;
    }

    public Client execute(String id, Type type) {
        return clientDataSource.findClient(id, type).orElseThrow(ClientNotFound::new);
    }
}
