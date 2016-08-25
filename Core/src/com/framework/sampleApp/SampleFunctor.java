package com.framework.sampleApp;

import com.framework.core.Functor;

/**
 * Created by suraj on 4/20/2016.
 */
public class SampleFunctor implements Functor {
    @Override
    public void pre() {
        System.out.println("PRE operation has been executed...");
    }

    @Override
    public void post() {
        System.out.println("POST operation has been executed...");
    }
}
