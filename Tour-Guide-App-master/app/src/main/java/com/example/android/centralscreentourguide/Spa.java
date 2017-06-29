package com.example.android.centralscreentourguide;

/**
 * Created by Bianka Matyas on 19/06/2017.
 */

public class Spa {

    private String mSpaName;
    private String mSpaAddress;

    /**
     * Create a new Spa object.
     *
     * @param spaName    is the name of the corresponding spa
     * @param spaAddress is the address of the corresponding spa
     */
    public Spa(String spaName, String spaAddress) {
        mSpaName = spaName;
        mSpaAddress = spaAddress;
    }

    /**
     * Get the name of the corresponding spa
     */
    public String getmSpaName() {
        return mSpaName;
    }

    /**
     * Get the address of the corresponding spa
     */
    public String getmSpaAddress() {
        return mSpaAddress;
    }
}

