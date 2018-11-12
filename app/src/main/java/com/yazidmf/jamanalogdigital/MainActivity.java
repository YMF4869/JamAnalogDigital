package com.yazidmf.jamanalogdigital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    AnalogClock analogClock;
    Button id_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analogClock = (AnalogClock)findViewById(R.id.analogClock);
    }
}
