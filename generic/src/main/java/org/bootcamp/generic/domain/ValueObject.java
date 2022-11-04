package org.bootcamp.generic.domain;

import java.io.Serializable;

public interface ValueObject<T> extends Serializable {
    T value();
}
