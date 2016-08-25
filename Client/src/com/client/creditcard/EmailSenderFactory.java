package com.client.creditcard;

import com.framework.core.Functor;
import com.framework.core.Transaction;

/**
 * Created by suraj on 4/19/2016.
 */
public class EmailSenderFactory {
    public static Functor getEmailSender(Transaction t){
            return new EmailSenderPersonFunctor(t);
    }
}
