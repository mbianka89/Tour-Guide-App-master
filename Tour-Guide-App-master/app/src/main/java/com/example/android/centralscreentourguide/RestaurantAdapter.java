package com.example.android.centralscreentourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Matyas Bianka on 17/06/2017.
 */

    /*
    * {@link RestaurantAdapter} is an {@li  nk ArrayAdapter} that can provide the layout for each list
    * based on a data source, which is a list of {@link Restaurant} objects.
    * */
public class RestaurantAdapter extends ArrayAdapter<Restaurant> {

    private static final String LOG_TAG = RestaurantAdapter.class.getSimpleName();

    /**
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     */
    public RestaurantAdapter(Activity context, ArrayList<Restaurant> restaurants) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, restaurants);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Restaurant} object located at this position in the list
        Restaurant currentrestaurant = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID
        TextView restaurantNameTextView = (TextView) listItemView.findViewById(R.id.restaurant_name_text_view);
        // Get the restaurant name from the current Restaurant object and
        // set this text on the name TextView
        restaurantNameTextView.setText(currentrestaurant.getmRestaurantName());

        // Find the TextView in the list_item.xml layout with the ID
        TextView restaurantTelTextView = (TextView) listItemView.findViewById(R.id.restaurant_tel_text_view);
        // Get the telephone number from the current Restaurant object and
        // set this text on the telephone number TextView
        restaurantTelTextView.setText(currentrestaurant.getmRestaurantTel());

        // Return the whole list item layout (containing 2 TextViews )
        // so that it can be shown in the ListView
        return listItemView;
    }
}