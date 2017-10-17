package com.example.abhinav.mapsapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Abhinav on 10/17/2017.
 */

public class Geometry {

    @SerializedName("location")
    Location location;

    public Location getLocation() {
        return location;
    }
}
