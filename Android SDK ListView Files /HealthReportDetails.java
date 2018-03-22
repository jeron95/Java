package com.example.android_sp17.healthreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HealthReportDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_report_details);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String days = intent.getStringExtra("days");
        float BMI = Float.valueOf(intent.getStringExtra("BMI"));

        TextView tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText(name);
        TextView tv5 = (TextView) findViewById(R.id.textView5);
        tv5.setText(days);
        TextView tv6 = (TextView) findViewById(R.id.textView6);
        String BMIMessage = BMI + "\n\n";
        if (BMI <= 18.5)
        {
            BMIMessage = BMIMessage + "You are considered underweight ";
        }
        else if (BMI > 18.5 && BMI <= 24.9)
        {
            BMIMessage = BMIMessage + "You are within a healthy weight range";
        }
        else if (BMI >= 25.0 && BMI <= 29.9)
        {
            BMIMessage = BMIMessage + "You are considered overweight";
        }
        else if (BMI >= 30.0 && BMI <= 34.99)
        {
            BMIMessage = BMIMessage + "You are considered obese (Obesity Class 1)";
        }
        else if (BMI >= 35.0 && BMI <= 39.99)
        {
            BMIMessage = BMIMessage + "You are considered obese (Obesity Class 2)";
        }
        else if (BMI >= 40.0)
        {
            BMIMessage = BMIMessage + "You are considered obese (Obesity Class 3)";
        }

        tv6.setText(BMIMessage);
    }
}
