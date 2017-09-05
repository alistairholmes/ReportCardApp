package com.example.android.reportcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Create an {@link ArrayList} of Subject Results.
        ReportCard reportCard = new ReportCard("name",1,2,3,4,5);
        reportCard.setStudentName("Alistair Holmes");
        reportCard.setMathsResults(55);
        reportCard.setEnglishResults(90);
        reportCard.setGeographyResults(95);
        reportCard.setBiologyResults(58);
        reportCard.setHistoryResults(98);

        //Log to console
        Log.v("MainActivity", reportCard.toString());

    }
}
