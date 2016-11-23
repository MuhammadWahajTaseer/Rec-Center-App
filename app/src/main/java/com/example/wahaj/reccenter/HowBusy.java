package com.example.wahaj.reccenter;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HowBusy extends AppCompatActivity {

    private ViewPager viewPager;
    private CustomSwipeAdapterFitness adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_busy);

        viewPager = (ViewPager) findViewById(R.id.view_pager_fitness);
        adapter = new CustomSwipeAdapterFitness(this);
        viewPager.setAdapter(adapter);
    }


}
