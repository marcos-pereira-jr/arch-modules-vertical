package com.acner.item.domain;

import java.util.Optional;

public interface ClientDataSource {
    Optional<Client> findClient(String id, Type type);
}
