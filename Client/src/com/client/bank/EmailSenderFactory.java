package com.client.bank;

import com.framework.core.Functor;
import com.framework.core.Transaction;

/**
 * Created by suraj on 4/19/2016.
 */
public class EmailSenderFactory {
    public static Functor getEmailSender(String partyType, Transaction t){
        if(partyType == "Personal") {
            return new EmailSenderPersonFunctor(t);
        }
        else {
            return new EmailSenderCompanyFunctor(t);
        }
    }
}
