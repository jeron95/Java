package com.example.android_sp17.healthreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.people_list_view);
        final ArrayList<Person> peopleList = Person.getPersonListFromFile(this, R.raw.people);

        String[] listItems = new String[peopleList.size()];
        for(int i=0; i<peopleList.size(); i++)
        {
            Person p = peopleList.get(i);
            listItems[i] = p.getName();
        }

        PersonAdapter adapter = new PersonAdapter(this, peopleList);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {


                Person p = peopleList.get(position);
                Toast.makeText(getApplicationContext(), p.getName(), Toast.LENGTH_SHORT).show();


                Intent detailIntent = new Intent(getApplicationContext(), HealthReportDetails.class);

                detailIntent.putExtra("name", p.getName());
                detailIntent.putExtra("days", "" + p.getDaysLived());
                detailIntent.putExtra("BMI", "" + p.getBMI());

                startActivity(detailIntent);

            }
        });
    }
}
