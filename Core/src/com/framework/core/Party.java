package com.framework.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bereket on 4/18/2016.
 */
public abstract class Party implements IParty {

    protected String name;
    protected String email;
    protected String street;
    protected String city;
    protected String state;
    protected String zip;
    public String type;

    List<IAccount> accounts = new ArrayList<>();


    @Override
    public boolean addAccount(IAccount acc) {
        this.accounts.add(acc);
        return true;
    }

    @Override
    public boolean removeAccount(IAccount acc) {
        this.accounts.remove(acc);
        return true;
    }

    @Override
    public Account getAccount(String accountNumber) {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public List<IAccount> getAllAccounts() {
        return accounts;
    }


}
