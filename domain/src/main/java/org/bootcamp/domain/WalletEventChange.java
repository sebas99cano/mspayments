package org.bootcamp.domain;

import org.bootcamp.domain.events.CountAdded;
import org.bootcamp.domain.events.WalletCreated;
import org.bootcamp.generic.domain.EventChange;

import java.util.HashMap;

public class WalletEventChange extends EventChange {
    public WalletEventChange(Wallet wallet) {
        apply((WalletCreated event) -> {
            wallet.coin = event.getCoin();
            wallet.userId = event.getUserId();
            wallet.counts = new HashMap<>();
        });

        apply((CountAdded event) -> {
            wallet.counts.put(event.getCountId(), new Count(event.getCountId(), event.getCardNumber()));
        });
    }
}
