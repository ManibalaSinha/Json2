package com.example.manibala.json.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Example {
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("_id")
    @Expose
    public Integer id;
    @SerializedName("coord")
    @Expose
    public Coord coord;
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country ="US";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

}
