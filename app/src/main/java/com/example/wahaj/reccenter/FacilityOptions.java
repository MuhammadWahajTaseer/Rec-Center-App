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

        Intent intent = getIntent();
        myMessage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Setting theme of the activity (Basically just the menu bar)
        if(myMessage.equals("fitness")){
            setTheme(R.style.AppThemeRed);
            setTitle("Fitness Center");
        }
        else if(myMessage.equals("aquatic")){
            setTheme(R.style.AppThemeBBlue);
            setTitle("Aquatic Center");
        }
        else if(myMessage.equals("climbing")){
            setTheme(R.style.AppThemeBrown);
            setTitle("Climbing Wall");
        }
        else if(myMessage.equals("courts")){
            setTheme(R.style.AppThemeOrange);
            setTitle("Racket Center");
        }
        else if(myMessage.equals("olympicoval")){
            setTheme(R.style.AppThemeStoneBlue);
            setTitle("Olympic Oval");
        }
        else if(myMessage.equals("outdoor")){
            setTheme(R.style.AppThemeLightGreen);
            setTitle("Outdoor Center");
        }
        else{
            setTheme(R.style.AppThemeGrey);
        }


        setContentView(R.layout.activity_facility_options);


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
