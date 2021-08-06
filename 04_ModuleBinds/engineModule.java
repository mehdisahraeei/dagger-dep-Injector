package com.mahdi.dagger;

import com.mahdi.dagger.department.engine;
import com.mahdi.dagger.department.young;
import dagger.Binds;
import dagger.Module;


@Module
public abstract class engineModule {


    @Binds
    public abstract engine setEngine(young young);


    
}
