package com.example.android.centralscreentourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);

        // Create an ArrayList of Sight objects
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight ((getString(R.string.sight_name1)),(getString( R.string.sight_address1)), R.drawable.parlaiment));
        sights.add(new Sight ((getString(R.string.sight_name2)),(getString( R.string.sight_address2)), R.drawable.national_museum));
        sights.add(new Sight ((getString(R.string.sight_name3)),(getString( R.string.sight_address3)), R.drawable.st_stephans_basilica));
        sights.add(new Sight ((getString(R.string.sight_name4)),(getString( R.string.sight_address4)), R.drawable.chain_bridge));

        // Create an {@link SightAdapter}, whose data source is a list of
        // {@link Sight}s. The adapter knows how to create list item views for each item
        // in the list.
        SightAdapter sightAdapter = new SightAdapter(this, sights);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_sights);
        listView.setAdapter(sightAdapter);
    }
}
