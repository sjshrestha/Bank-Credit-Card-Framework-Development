package com.client.bank;

import com.framework.core.IOrganisation;
import com.framework.core.IPerson;

import java.util.Date;

/**
 * Created by suraj on 4/18/2016.
 */
public class PartyFactory {
    public static IPerson getParty(String name, String email, String street, String city, String state, String zipCode, Date dob){
        IPerson p = new Person();
        p.setName(name);
        p.setEmail(email);
        p.setState(street);
        p.setCity(city);
        p.setState(state);
        p.setZip(zipCode);
        p.setDob(dob);

        return p;
    }


    public static IOrganisation getParty(String name, String street, String city, String state, String zipcode, Date expiry){
        return getParty(name,"",street,city,state,zipcode,0);


    }

    public static IOrganisation getParty(String name, String email, String street, String city, String state, String zipCode, int noOfEmp){
        IOrganisation o = new Company();
        o.setName(name);
        o.setEmail(email);
        o.setState(street);
        o.setCity(city);
        o.setState(state);
        o.setZip(zipCode);
        o.setNoOfEmployee(noOfEmp);

        return o;
    }
}
