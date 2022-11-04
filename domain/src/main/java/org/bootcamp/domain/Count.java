package org.bootcamp.domain;

import org.bootcamp.domain.value.CardNumber;
import org.bootcamp.domain.value.CountId;
import org.bootcamp.generic.domain.Entity;

public class Count extends Entity<CountId> {

    private CardNumber cardNumber;

    public Count(CountId id, CardNumber cardNumber) {
        super(id);
        this.cardNumber = cardNumber;
    }
}
