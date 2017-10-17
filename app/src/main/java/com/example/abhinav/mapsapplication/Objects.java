package com.example.abhinav.mapsapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Abhinav on 10/17/2017.
 */

public class Objects {

    @SerializedName("results")
    List<Restaurants> restaurantsList;

    public List<Restaurants> getRestaurantsList() {
        return restaurantsList;
    }
}
