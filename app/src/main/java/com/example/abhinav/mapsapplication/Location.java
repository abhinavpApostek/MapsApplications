package com.example.abhinav.mapsapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Abhinav on 10/17/2017.
 */

public class Location {

    @SerializedName("lat")
    String latitude;
    @SerializedName("lng")
    String longitude;

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
