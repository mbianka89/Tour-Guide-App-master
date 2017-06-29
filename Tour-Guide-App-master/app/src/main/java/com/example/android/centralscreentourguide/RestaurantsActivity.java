package com.example.android.centralscreentourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        // Create a list of restaurants
        ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
        restaurants.add(new Restaurant((getString(R.string.restaurant_name1)),getString( R.string.restaurant_tel1)));
        restaurants.add(new Restaurant((getString(R.string.restaurant_name2)),getString( R.string.restaurant_tel2)));
        restaurants.add(new Restaurant((getString(R.string.restaurant_name3)),getString( R.string.restaurant_tel3)));
        restaurants.add(new Restaurant((getString(R.string.restaurant_name4)),getString( R.string.restaurant_tel4)));

        // Create an {@link RestaurantAdapter}, whose data source is a list of {@link Restaurant}s. The
        // adapter knows how to create list items for each item in the list.
        RestaurantAdapter adapter = new RestaurantAdapter(this, restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_restaurants.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list_restaurants);

        // Make the {@link ListView} use the {@link RestaurantAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Restaurant} in the list.
        listView.setAdapter(adapter);
    }
}
