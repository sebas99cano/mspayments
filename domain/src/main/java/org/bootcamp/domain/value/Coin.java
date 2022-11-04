package org.bootcamp.domain.value;

import org.bootcamp.generic.domain.ValueObject;

import java.util.Objects;

public class Coin implements ValueObject<Integer> {
    private final Integer value;

    public Coin(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value < 0) {
            throw new IllegalArgumentException("The coin is negative number");
        }
        if (this.value > 999999999) {
            throw new IllegalArgumentException("The coin is greater than 999.999.999");
        }
    }

    @Override
    public Integer value() {
        return value;
    }
}
