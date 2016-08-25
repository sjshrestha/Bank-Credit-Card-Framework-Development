package com.client.creditcard;

import com.framework.core.Party;

import java.sql.Date;


/**
 * Created by Bijay on 4/19/2016.
 */
public class CardHolder extends Party {

    public CardHolder(String name, String email, String street, String city, String state, String zipCode,
                      Date expiryDate){
        this.name = name;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zipCode;
        this.expiryDate = expiryDate;

    }

    private Date expiryDate;

    public Date getExpiryDate(){
        return expiryDate;
    }

    public void setExpiryDate(Date date){
        this.expiryDate = date;
    }

    @Override
    public void update() {

    }
}
