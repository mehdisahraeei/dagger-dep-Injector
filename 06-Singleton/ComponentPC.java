package com.mahdi.dagger;

import javax.inject.Singleton;
import dagger.Component;


@Singleton
@Component
public interface ComponentPC {


    Pc getPC();



}
