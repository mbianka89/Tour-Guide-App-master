package com.example.android.centralscreentourguide;

/**
 * Created by Matyas Bianka on 17/06/2017.
 */

public class Restaurant {

    private String mRestaurantName;
    private String mRestaurantTel;

    /**
     * Create a new Restaurant object.
     *
     * @param restaurantName is the name of the corresponding restaurant
     * @param restaurantTel  is the tel# of the corresponding restaurant
     */
    public Restaurant(String restaurantName, String restaurantTel) {
        mRestaurantName = restaurantName;
        mRestaurantTel = restaurantTel;
    }

    /**
     * Get the name of the corresponding restaurant
     */
    public String getmRestaurantName() {
        return mRestaurantName;
    }

    /**
     * Get the tel# of the corresponding restaurant
     */
    public String getmRestaurantTel() {
        return mRestaurantTel;
    }
}
