package com.example.wahaj.reccenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Ripple effect only shows when there is a method associated with it
    public void FitnessPressed(View view) {

    }

    public void aquaticPressed(View view) {
    }

    public void climbingPressed(View view) {
    }

    public void courtsPressed(View view) {
    }

    public void olympicovalPressed(View view) {
    }

    public void outdoorPressed(View view) {
    }

    public void levelupPressed(View view) {
    }

    public void programsPressed(View view) {
    }

    public void parkingPressed(View view) {
    }

    public void hoursPressed(View view) {
    }

    public void howbusyPressed(View view) {
    }

    public void rentalsPressed(View view) {
        Intent myIntent = new Intent(MainActivity.this, RentalsActivity.class);
        MainActivity.this.startActivity(myIntent);

    }
}
