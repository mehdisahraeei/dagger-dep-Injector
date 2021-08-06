package com.mahdi.dagger;

import com.mahdi.dagger.department.engine;
import com.mahdi.dagger.department.young;
import dagger.Module;
import dagger.Provides;

@Module
public class engineModule {


    @Provides
    public engine setEngine(young young)
    {
        return young;
    }




}
