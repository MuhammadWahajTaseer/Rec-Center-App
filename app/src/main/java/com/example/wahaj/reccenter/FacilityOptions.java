package com.example.wahaj.reccenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class FacilityOptions extends AppCompatActivity {

    public String myMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility_options);

        Intent intent = getIntent();
        myMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


    }

    public void HoursOptionPressed(View view) {
        if(myMessage.equals("fitness")){
            Intent myIntent = new Intent(FacilityOptions.this, FitnessHours.class);
            FacilityOptions.this.startActivity(myIntent);
        }

    }

    public void HowBusyOptionPressed(View view) {
    }

    public void AboutOptionPressed(View view) {
    }

    public void ContactOptionPressed(View view) {
    }
}
