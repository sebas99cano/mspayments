package org.bootcamp.domain.value;

import org.bootcamp.generic.domain.ValueObject;

import java.util.Objects;

public class CardNumber implements ValueObject<String> {
    private final String value;

    public CardNumber(String value) {
        this.value = Objects.requireNonNull(value);

        if (this.value.isEmpty()) {
            throw new IllegalArgumentException("The card number is empty");
        }

        if (this.value.length() > 30) {
            throw new IllegalArgumentException("The card number is greater than 30");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
