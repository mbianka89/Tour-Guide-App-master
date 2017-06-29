package com.example.android.centralscreentourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 17/06/2017.
 */

/*
* {@link HotelAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Hotel} objects.
* */
public class HotelAdapter extends ArrayAdapter<Hotel> {

    private static final String LOG_TAG = HotelAdapter.class.getSimpleName();

    /**
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     */
    public HotelAdapter(Activity context, ArrayList<Hotel> hotels) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, hotels);
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
                    R.layout.list_item_hotels, parent, false);
        }

        // Get the {@link Hotel} object located at this position in the list
        Hotel currenthotel = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID
        TextView hotelNameTextView = (TextView) listItemView.findViewById(R.id.hotel_name_text_view);
        // Get the hotel name from the current Hotel object and
        // set this text on the name TextView
        hotelNameTextView.setText(currenthotel.getmHotelName());

        // Find the TextView in the list_item.xml layout with the ID
        TextView hotelTelTextView = (TextView) listItemView.findViewById(R.id.hotel_tel_text_view);
        // Get the telephone number from the current Hotel object and
        // set this text on the telephone number TextView
        hotelTelTextView.setText(currenthotel.getmHotelTel());

        // Return the whole list item layout (containing 2 TextViews )
        // so that it can be shown in the ListView
        return listItemView;
    }
}
