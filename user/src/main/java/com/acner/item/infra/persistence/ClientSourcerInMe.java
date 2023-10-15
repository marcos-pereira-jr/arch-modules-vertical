package com.acner.item.infra.persistence;

import com.acner.item.domain.Client;
import com.acner.item.domain.ClientDataSource;
import com.acner.item.domain.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClientSourcerInMe implements ClientDataSource {
    private final List<Client> clients;

    public ClientSourcerInMe() {
        clients = new ArrayList<>();
        clients.add(new Client("1", "Afua Servius", Type.USER));
        clients.add(new Client("2", "Fiacre Gunnar", Type.APP));
        clients.add(new Client("3", "Gülay Felicjan", Type.USER));
    }

    @Override
    public Optional<Client> findClient(String id, Type type) {
        return clients.stream().filter(e -> e.getId().equals(id) && e.getType().equals(type)).findFirst();
    }
}
