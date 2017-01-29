package com.example.garni.numberpicker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.NumberPicker;

/**
 * Created by garni on 26/01/2017.
 */

public class NumberPickerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumberPicker numberPicker = (NumberPicker) findViewById(R.id.numberPicker);
        numberPicker.setMinValue(10);
        numberPicker.setMaxValue(20);
    }
}
