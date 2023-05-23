package com.mahdi.dagger;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Components obj = DaggerComponents.create();
        obj.setCar(this);

    }



}