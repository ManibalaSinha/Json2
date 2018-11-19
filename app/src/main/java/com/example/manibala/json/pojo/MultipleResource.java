package com.example.manibala.json.pojo;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
// MultipleResource is Model POJO class for our response object that's used to map the response parameters to their respective variable
// These pojo class act as method return type
public class MultipleResource {
    @SerializedName("name")
    public String name;
    @SerializedName("Country")
    public String country;
        @SerializedName("lon")
       // @Expose
        private Double lon;
        @SerializedName("lat")
       // @Expose
        private Double lat;

    @SerializedName("data")
    public List<Datum> data = new ArrayList<>();

       /* public Double getLon() {
            return lon;
        }

        public void setLon(Double lon) {
            this.lon = lon;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }
            */

    public class Datum {

        @SerializedName("name")
        public String name;
        @SerializedName("country")
        public String country;
        @SerializedName("_id")
        @Expose
        private Integer id;
        @SerializedName("coord")
        @Expose
        private Coord coord;

       /* public String getCountry() {
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

        public Coord getCoord() {
            return coord;
        }

        public void setCoord(Coord coord) {
            this.coord = coord;
        }
*/
    }

}
