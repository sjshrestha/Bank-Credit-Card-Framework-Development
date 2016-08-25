package com.client.creditcard;

import com.framework.core.Party;

import java.sql.Date;

public class PartyFactory {
    public static Party getParty(String name, String email, String street, String city, String state, String zipCode,
                                 Date expiryDate){
        Party p = new CardHolder(name, email, street, city,state,zipCode,expiryDate);
        return p;
    }
}