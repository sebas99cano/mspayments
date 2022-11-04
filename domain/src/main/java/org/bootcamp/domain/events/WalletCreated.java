package org.bootcamp.domain.events;

import org.bootcamp.domain.value.Coin;
import org.bootcamp.domain.value.UserId;
import org.bootcamp.generic.domain.DomainEvent;

public class WalletCreated extends DomainEvent {

    private final UserId userId;

    private final Coin coin;

    public WalletCreated(UserId userId, Coin coin) {
        super("org.bootcamp.WalletCreated");
        this.userId = userId;
        this.coin = coin;
    }

    public Coin getCoin() {
        return coin;
    }

    public UserId getUserId() {
        return userId;
    }
}
