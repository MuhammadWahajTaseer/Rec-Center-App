package com.example.wahaj.reccenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RentalsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentals2);
    }

    public void rentalsSkiPressed(View view) {
    }

    public void rentalsBikingPressed(View view) {
    }

    public void rentalsCampingPressed(View view) {
    }

    public void rentalsWatersportsPressed(View view) {
        Intent myIntent = new Intent(RentalsActivity2.this, RentalsActivity3.class);
        RentalsActivity2.this.startActivity(myIntent);

    }

    public void rentalClimbingPressed(View view) {
    }

    public void rentalsClothingPressed(View view) {
    }
}
