package com.example.android.centralscreentourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the hotels category
        TextView hotels = (TextView) findViewById(R.id.hotels);

        // Set a click listener on that View
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);

                // Start the new activity
                startActivity(hotelsIntent);
            }
        });

        // Find the View that shows the hotels category
        TextView spas = (TextView) findViewById(R.id.spas);

        // Set a click listener on that View
        spas.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent spasIntent = new Intent(MainActivity.this, SpasActivity.class);

                // Start the new activity
                startActivity(spasIntent);
            }
        });
        // Find the View that shows the hotels category
        TextView sights = (TextView) findViewById(R.id.sights);

        // Set a click listener on that View
        sights.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent sightsIntent = new Intent(MainActivity.this, SightsActivity.class);

                // Start the new activity
                startActivity(sightsIntent);
            }
        });
    }
}
