package com.mahdi.dagger;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {


    private static final String tag = "pc";

    @Inject
    Pc pc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ComponentPC component = DaggerComponentPC.builder()
                .setX(10)
                .setY(20)
                .build();

        component.setThis(this);


    }



}