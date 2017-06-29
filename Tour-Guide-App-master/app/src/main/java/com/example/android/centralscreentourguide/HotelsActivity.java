package com.example.android.centralscreentourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        // Create a list of hotels
        ArrayList<Hotel> hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel((getString(R.string.hotel_name1)),getString( R.string.hotel_tel1)));
        hotels.add(new Hotel((getString(R.string.hotel_name2)),getString( R.string.hotel_tel2)));
        hotels.add(new Hotel((getString(R.string.hotel_name3)),getString( R.string.hotel_tel3)));
        hotels.add(new Hotel((getString(R.string.hotel_name4)),getString( R.string.hotel_tel4)));

        // Create an {@link HotelAdapter}, whose data source is a list of {@link Hotel}s. The
        // adapter knows how to create list items for each item in the list.
        HotelAdapter adapter = new HotelAdapter(this, hotels);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_hotels.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list_hotels);

        // Make the {@link ListView} use the {@link HotelAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Hotel} in the list.
        listView.setAdapter(adapter);

    }
}
