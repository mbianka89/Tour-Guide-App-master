package com.example.android.centralscreentourguide;

/**
 * Created by Matyas Bianka on 17/06/2017.
 */

public class Hotel {

    private String mHotelName;
    private String mHotelTel;

    /**
     * Create a new Hotel object.
     *
     * @param hotelName is the name of the corresponding hotel
     * @param hotelTel  is the tel# of the corresponding hotel
     */
    public Hotel(String hotelName, String hotelTel) {
        mHotelName = hotelName;
        mHotelTel = hotelTel;
    }

    /**
     * Get the name of the corresponding hotel
     */
    public String getmHotelName() {
        return mHotelName;
    }

    /**
     * Get the tel# of the corresponding hotel
     */
    public String getmHotelTel() {
        return mHotelTel;
    }
}


