package com.example.wahaj.reccenter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RentalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentals);
    }

    public void indoorRentalsPressed(View view) {
    }

    public void outdoorRentalsPressed(View view) {
        Intent myIntent = new Intent(RentalsActivity.this, RentalsActivity2.class);
        RentalsActivity.this.startActivity(myIntent);
    }
}
