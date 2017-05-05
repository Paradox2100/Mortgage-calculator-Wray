package com.mobileappdevelopment.mortgage_calculator_wray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class Mortgage_Input extends AppCompatActivity {

    private EditText homeVal;
    private EditText loanAmnt;
    private EditText intrestRt;
    private EditText loanTrm;
    private EditText startDt;
    private EditText propTax;
    private EditText homeInsure;
    private EditText monthHOA;
    private Button calcBtn;
    private Button PaymentBtn;

    private Intent iLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mortgage__input);

        homeVal = (EditText)findViewById(R.id.homeValue);
        loanAmnt = (EditText)findViewById(R.id.loanAmount);
        intrestRt = (EditText)findViewById(R.id.intrestRate);
        loanTrm = (EditText)findViewById(R.id.loanTerm);
        startDt = (EditText)findViewById(R.id.startDate);
        propTax = (EditText)findViewById(R.id.propertyTax);
        homeInsure = (EditText)findViewById(R.id.homeInsurance);
        monthHOA = (EditText)findViewById(R.id.HOA);

        calcBtn = (Button)findViewById(R.id.calculateMortgageButton);
        calcBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                iLauncher = new Intent(getApplicationContext(), Mortgage_Output.class).putExtra("mortgageVal", homeVal.getText().toString());
                startActivity(iLauncher);

            }
        });

        PaymentBtn = (Button)findViewById(R.id.paymentSummaryButton);
        PaymentBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                iLauncher = new Intent(getApplicationContext(), Payment_Summary.class).putExtra("paymentSummary", loanAmnt.getText().toString());
                startActivity(iLauncher);
            }
        });

    }

    @Override
    protected void onSaveInstanceState (Bundle outState){
        outState.putString("homeValDisplay", homeVal.getText().toString());
        outState.putString("loanAmntDisplay", loanAmnt.getText().toString());
        outState.putString("intrestRtDisplay", intrestRt.getText().toString());
        outState.putString("loanTrmDisplay", loanTrm.getText().toString());
        outState.putString("startDtDisplay", startDt.getText().toString());
        outState.putString("propTaxDisplay", propTax.getText().toString());
        outState.putString("homeInsureDisplay", homeInsure.getText().toString());
        outState.putString("HOADisplay", monthHOA.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        homeVal.setText(savedInstanceState.getString("homeValDisplay"));
        loanAmnt.setText(savedInstanceState.getString("loanAmntDisplay"));
        intrestRt.setText(savedInstanceState.getString("intrestRtDisplay"));
        loanTrm.setText(savedInstanceState.getString("loanTrmDisplay"));
        startDt.setText(savedInstanceState.getString("startDtDisplay"));
        propTax.setText(savedInstanceState.getString("propTaxDisplay"));
        homeInsure.setText(savedInstanceState.getString("homeInsureDisplay"));
        monthHOA.setText(savedInstanceState.getString("HOADisplay"));

    }


}
