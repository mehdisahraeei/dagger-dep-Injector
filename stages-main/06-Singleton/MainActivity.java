package com.mahdi.dagger;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ComponentPC component = DaggerComponentPC.create();
        Pc pc1 = component.getPC();
        Pc pc2 = component.getPC();

        pc1.Display();
        pc2.Display();

    }


}