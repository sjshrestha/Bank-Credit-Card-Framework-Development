package com.framework.core;

/**
 * Created by Bereket on 4/18/2016.
 */
public abstract class IOrganisation extends Party implements IParty {
    private int noOfEmployee;
    public void setNoOfEmployee(int noOfEmp){
        this.noOfEmployee = noOfEmp;
    }
}
