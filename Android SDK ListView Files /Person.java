package com.example.android_sp17.healthreport;

import android.content.Context;
import android.icu.util.Calendar;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by android-sp17 on 3/27/17.
 */

public class Person {

    String name;
    int month;
    int year;
    float inches;
    float pounds;

    Person(String n, int m, int y, float i, float p) {
        name = n;
        month = m;
        year = y;
        inches = i;
        pounds = p;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public float getInches() {
        return inches;
    }

    public float getPounds() {
        return pounds;
    }

    public static ArrayList<Person> getPersonListFromFile(Context ctx, int id) {
        ArrayList<Person> p = new ArrayList<Person>();
        Scanner inFile = new Scanner(ctx.getResources().openRawResource(id));
        StringBuilder stringBuilder = new StringBuilder();
        while (inFile.hasNext()) {
            StringTokenizer line = new StringTokenizer(inFile.nextLine(), ",");
            p.add(new Person(line.nextToken(), Integer.valueOf(line.nextToken()), Integer.valueOf(line.nextToken()), Float.valueOf(line.nextToken()), Float.valueOf(line.nextToken())));
        }

        return p;
    }

    public int getDaysLived() {
        Person per;
        Calendar c = Calendar.getInstance();
        int currentYear = c.get(Calendar.YEAR);
        int currentMonth = c.get(Calendar.MONTH) + 1;
        int currentDay = c.get(Calendar.DAY_OF_MONTH);
        int daysLived = ((currentYear - year) * 365) + (((currentMonth - 1) * 30) + currentDay);

        return daysLived;
    }

    public double getBMI() {
        float weight = getPounds();
        float height = getInches();
        double bmi = weight / Math.pow(height, 2) * 703;

        return bmi;
    }
}


