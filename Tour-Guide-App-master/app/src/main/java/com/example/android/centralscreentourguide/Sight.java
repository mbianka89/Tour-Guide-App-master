package com.example.android.centralscreentourguide;

/**
 * Created by Bianka Matyas on 19/06/2017.
 */

public class Sight {

    /**
     * {@link Sight} represents a single Android platform release.
     * Each     object has 3 properties: sight`s name, address, and image resource ID.
     */

    // Name of the sight
    private String mSightName;

    // Address
    private String mSightAddress;

    // Drawable resource ID
    private int mImageResourceId;

    /*
    * Create a new Sight object.
    *
    * @param vSightName is the name of the sight
    * @param vSightAddress is the corresponding sight`s address
    * @param image is drawable reference ID that corresponds to the sight
    * */
    public Sight(String vSightName, String vSightAddress, int imageResourceId) {
        mSightName = vSightName;
        mSightAddress = vSightAddress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the sight
     */
    public String getmSightName() {
        return mSightName;
    }

    /**
     * Get the sight`s address
     */
    public String getmSightAddress() {
        return mSightAddress;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}


