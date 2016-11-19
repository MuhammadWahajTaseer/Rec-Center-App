package com.example.wahaj.reccenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RentalsOutdoor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentals_outdoor);
    }

    public void rentalsSkiPressed(View view) {
    }

    public void rentalsBikingPressed(View view) {
    }

    public void rentalsCampingPressed(View view) {
    }

    public void rentalsWatersportsPressed(View view) {
        Intent myIntent = new Intent(RentalsOutdoor.this, RentalsWaterSports.class);
        RentalsOutdoor.this.startActivity(myIntent);

    }

    public void rentalClimbingPressed(View view) {
    }

    public void rentalsClothingPressed(View view) {
    }
}
