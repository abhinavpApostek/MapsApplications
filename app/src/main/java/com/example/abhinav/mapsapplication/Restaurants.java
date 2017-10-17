package com.example.abhinav.mapsapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Abhinav on 10/17/2017.
 */

public class Restaurants {

    @SerializedName("name")
    String name;
    @SerializedName("geometry")
    Geometry geometry;

    public String getName() {
        return name;
    }

    public Geometry getGeometry() {
        return geometry;
    }
}
