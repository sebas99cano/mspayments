package org.bootcamp.generic.domain;

public class Entity<I extends Identity> {
    private final I id;

    public Entity(I id) {
        this.id = id;
    }

    public I entityId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return id.equals(obj);
    }
}
