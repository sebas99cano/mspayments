package org.bootcamp.domain;

import org.bootcamp.domain.events.CountAdded;
import org.bootcamp.domain.events.WalletCreated;
import org.bootcamp.domain.value.*;
import org.bootcamp.generic.domain.AggregateRoot;
import org.bootcamp.generic.domain.DomainEvent;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Wallet extends AggregateRoot<WalletId> {

    protected Map<CountId, Count> counts;
    protected Coin coin;
    protected UserId userId;

    public Wallet(WalletId id, UserId userId, Coin coin) {
        super(id);
        subscribe(new WalletEventChange(this));
        appendChange(new WalletCreated(userId, coin)).apply();
    }

    private Wallet(WalletId walletId) {
        super(walletId);
        subscribe(new WalletEventChange(this));
    }

    public static Wallet from(WalletId walletId, List<DomainEvent> events) {
        var wallet = new Wallet(walletId);
        events.forEach(wallet::applyEvent);
        return wallet;
    }

    public void addCount(CountId countId, CardNumber cardNumber) {
        appendChange(new CountAdded(countId, cardNumber)).apply();
    }

    public Count getCountById(CountId countId) {
        return counts.get(countId);
    }

    public Collection<Count> counts() {
        return counts.values();
    }

    public Coin coin() {
        return this.coin;
    }

    public UserId userId() {
        return userId;
    }

}
