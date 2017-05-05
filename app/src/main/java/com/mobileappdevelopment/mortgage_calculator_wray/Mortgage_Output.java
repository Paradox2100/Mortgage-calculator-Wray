package com.mobileappdevelopment.mortgage_calculator_wray;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Mortgage_Output extends AppCompatActivity {

    private TextView mortgageDisplay;
    private String hold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mortgage__output);

        hold = getIntent().getStringExtra("mortgageVal");

        mortgageDisplay = (TextView) findViewById(R.id.mortgageDisplay);
        mortgageDisplay.setText(hold);

        }

}
