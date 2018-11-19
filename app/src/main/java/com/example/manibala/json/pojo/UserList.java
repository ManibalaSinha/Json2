package com.example.manibala.json.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    @SerializedName("country")
   // @Expose
    private String country;
    @SerializedName("name")
  //  @Expose
    private String name;
    @SerializedName("_id")
    //@Expose
    private Integer id;
    @SerializedName("coord")
    //@Expose
    private User coord;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public User getCoord() {
        return coord;
    }

    public void setCoord(User coord) {
        this.coord = coord;
    }

}

