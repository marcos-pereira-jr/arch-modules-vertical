package com.acner.item.domain;

public class Client {
    private final String id;
    private final String name;

    private final Type type;

    public Client(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

}
