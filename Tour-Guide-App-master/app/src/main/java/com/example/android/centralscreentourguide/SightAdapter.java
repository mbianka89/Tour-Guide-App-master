package com.example.android.centralscreentourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bianka Matyas on 19/06/2017.
 */

    /*
* {@link SightAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Sight} objects.
* */
public class SightAdapter extends ArrayAdapter<Sight> {

    private static final String LOG_TAG = SightAdapter.class.getSimpleName();

    /**
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param sights  A List of Sight objects to display in a list
     */
    public SightAdapter(Activity context, ArrayList<Sight> sights) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, sights);
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
                    R.layout.list_item_sights, parent, false);
        }

        // Get the {@link Sight} object located at this position in the list
        Sight currentSight = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.sight_name);
        // Get the version name from the current Sight object and
        // set this text on the name TextView
        nameTextView.setText(currentSight.getmSightName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.sight_address);
        // Get the version number from the current Sight object and
        // set this text on the number TextView
        addressTextView.setText(currentSight.getmSightAddress());

        // Find the ImageView in the list_item.xml layout with the ID
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_sight_image_view);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentSight.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

