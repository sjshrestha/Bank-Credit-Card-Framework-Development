package com.client.creditcard;

import com.framework.core.Account;


/**
 * Created by suraj on 4/18/2016.
 */
public class CardAccountFactory {

    public static CardAccountFactory getInstance() {
        return new CardAccountFactory();
    }

    public Account createAccount(CardType type, String accNo) {
        if (type == CardType.SILVER)
            return new Silver(accNo);
        else if (type == CardType.GOLD)
            return new Gold(accNo);
        else
            return new Bronze(accNo);
    }
}

