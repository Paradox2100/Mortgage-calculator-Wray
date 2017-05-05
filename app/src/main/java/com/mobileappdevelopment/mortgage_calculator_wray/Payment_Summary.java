package com.mobileappdevelopment.mortgage_calculator_wray;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Payment_Summary extends AppCompatActivity {

    private TextView paymentSumDisplay;
    private String hold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment__summary);

        hold = getIntent().getStringExtra("paymentSummary");

        paymentSumDisplay = (TextView) findViewById(R.id.paymentSummaryDisplay);
        paymentSumDisplay.setText(hold);
    }

}
