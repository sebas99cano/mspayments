package org.bootcamp.domain.events;

import org.bootcamp.domain.value.CardNumber;
import org.bootcamp.domain.value.CountId;
import org.bootcamp.generic.domain.DomainEvent;

public class CountAdded extends DomainEvent {

    private final CountId countId;
    private final CardNumber cardNumber;

    public CountAdded(CountId countId, CardNumber cardNumber) {
        super("org.bootcamp.CountAdded");
        this.countId = countId;
        this.cardNumber = cardNumber;
    }

    public CardNumber getCardNumber() {
        return cardNumber;
    }

    public CountId getCountId() {
        return countId;
    }
}
