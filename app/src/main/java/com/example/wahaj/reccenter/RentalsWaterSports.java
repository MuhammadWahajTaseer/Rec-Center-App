package com.example.wahaj.reccenter;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RentalsWaterSports extends AppCompatActivity {

    ViewPager viewPager;
    CustomSwipeAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentals_water_sports);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
    }

    public void RentalEquimentPressed(View view) {
        Dialog dialog = new Dialog(this);

        dialog.setTitle("P Threads");
        dialog.setContentView(R.layout.custom_dialog_renting);
        dialog.show();
    }

    public void callToRentPressed(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:4032205038"));
        startActivity(intent);
    }
}
