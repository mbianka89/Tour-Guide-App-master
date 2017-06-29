package com.example.android.centralscreentourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SpasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spas);

        // Create a list of spas
        ArrayList<Spa> spas = new ArrayList<Spa>();
        spas.add(new Spa ((getString(R.string.spa_name1)),getString( R.string.spa_address1)));
        spas.add(new Spa ((getString(R.string.spa_name2)),getString( R.string.spa_address2)));
        spas.add(new Spa ((getString(R.string.spa_name3)),getString( R.string.spa_address3)));
        spas.add(new Spa ((getString(R.string.spa_name4)),getString( R.string.spa_address4)));

        // Create an {@link SpaAdapter}, whose data source is a list of {@link Spa}s. The
        // adapter knows how to create list items for each item in the list.
        SpaAdapter adapter = new SpaAdapter(this, spas);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_spas.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list_spas);

        // Make the {@link ListView} use the {@link SpaAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Spa} in the list.
        listView.setAdapter(adapter);
    }
}