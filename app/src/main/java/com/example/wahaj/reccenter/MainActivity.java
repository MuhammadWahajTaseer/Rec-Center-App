package com.example.wahaj.reccenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE = "hi";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Ripple effect only shows when there is a method associated with it
    public void FitnessPressed(View view) {
        Intent myIntent = new Intent(MainActivity.this, FacilityOptions.class);
        myIntent.putExtra(EXTRA_MESSAGE, "fitness");
        MainActivity.this.startActivity(myIntent);

    }

    public void aquaticPressed(View view) {
        Intent myIntent = new Intent(MainActivity.this, FacilityOptions.class);
        myIntent.putExtra(EXTRA_MESSAGE, "aquatic");
        MainActivity.this.startActivity(myIntent);
    }

    public void climbingPressed(View view) {
        Intent myIntent = new Intent(MainActivity.this, FacilityOptions.class);
        myIntent.putExtra(EXTRA_MESSAGE, "climbing");
        MainActivity.this.startActivity(myIntent);
    }

    public void courtsPressed(View view) {
        Intent myIntent = new Intent(MainActivity.this, FacilityOptions.class);
        myIntent.putExtra(EXTRA_MESSAGE, "courts");
        MainActivity.this.startActivity(myIntent);
    }

    public void olympicovalPressed(View view) {
        Intent myIntent = new Intent(MainActivity.this, FacilityOptions.class);
        myIntent.putExtra(EXTRA_MESSAGE, "olympicoval");
        MainActivity.this.startActivity(myIntent);
    }

    public void outdoorPressed(View view) {
        Intent myIntent = new Intent(MainActivity.this, FacilityOptions.class);
        myIntent.putExtra(EXTRA_MESSAGE, "outdoor");
        MainActivity.this.startActivity(myIntent);
    }

    public void levelupPressed(View view) {
        Intent myIntent = new Intent(MainActivity.this, FacilityOptions.class);
        myIntent.putExtra(EXTRA_MESSAGE, "levelup");
        MainActivity.this.startActivity(myIntent);
    }

    public void programsPressed(View view) {
        Intent myIntent = new Intent(MainActivity.this, FacilityOptions.class);
        myIntent.putExtra(EXTRA_MESSAGE, "programs");
        MainActivity.this.startActivity(myIntent);
    }

    public void parkingPressed(View view) {

    }

    public void rentalsPressed(View view) {
        Intent myIntent = new Intent(MainActivity.this, RentalsActivity.class);
        MainActivity.this.startActivity(myIntent);

    }
}
