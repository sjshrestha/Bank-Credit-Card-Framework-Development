package com.framework.core;

import com.framework.core.repo.IRepo;

/**
 * Created by Bereket on 4/18/2016.
 */

public abstract class AControllerFactory {
    public abstract IPartyController createPartyController(IRepo repo);
    public abstract IAccountController createAccountController(IRepo repo);
    public abstract ITransactionController createTransactionController(IRepo repo);
}
