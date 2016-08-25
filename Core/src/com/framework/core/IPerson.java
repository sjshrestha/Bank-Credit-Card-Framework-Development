package com.framework.core;

import java.util.Date;

/**
 * Created by Bereket on 4/18/2016.
 */
public abstract class IPerson extends Party implements IParty{

    Date dateOfBirth;
    public void setDob(Date dob){
        this.dateOfBirth = dob;
    }
}
