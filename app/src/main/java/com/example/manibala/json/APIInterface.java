package com.example.manibala.json;

import com.example.manibala.json.pojo.Coord;
import com.example.manibala.json.pojo.Example;
import com.example.manibala.json.pojo.MultipleResource;
import com.example.manibala.json.pojo.User;
import com.example.manibala.json.pojo.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
// pojo package defines 2 model classes for each of API endpoint responses defined in APIInterface.java class
interface APIInterface {
    // define methods that perform HTTP requests with annotation
    @GET("/api/unknown") // calls doGetListResources();
    // doGetListResources() is method name.
    Call<MultipleResource> doGetListResources();

    @POST("/api/users")
    Call<Coord> createUser(@Body Coord user);

    @GET("/api/users?")
    Call<Example> doGetUserList(@Query("name") String name);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<Example> doCreateUserWithField(@Field("name") String name, @Field("country") String country);

}
