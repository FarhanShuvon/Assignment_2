package com.example.myapplication;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Find all UI components by their IDs
        CheckBox checkBox = findViewById(R.id.checkBox);
        RadioButton radioButton = findViewById(R.id.radioButton);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        SeekBar seekBar = findViewById(R.id.seekBar);
        Switch switchButton = findViewById(R.id.switchButton);

        // You can now set listeners or interact with these components as needed
    }
}
