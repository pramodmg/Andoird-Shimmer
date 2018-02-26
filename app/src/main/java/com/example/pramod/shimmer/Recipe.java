package com.example.pramod.shimmer;

/**
 * Created by 11095 on 26/02/18.
 */

public class Recipe {
    int id;
    String name;
    String description;
    double price;
    String thumbnail;
    String chef;
    String timestamp;

    public Recipe() {

    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getChef() {
        return chef;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
