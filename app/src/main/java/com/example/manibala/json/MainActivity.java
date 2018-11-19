package com.example.manibala.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.manibala.json.pojo.MultipleResource;
import com.example.manibala.json.pojo.Coord;
import com.example.manibala.json.pojo.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//MainActivity call each of the API endpoints defined in the Interface class and display each of the fields in Toast/TextView
public class MainActivity extends AppCompatActivity {
    TextView responseText;
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        responseText = (TextView) findViewById(R.id.responseText);
        apiInterface = APIClient.getClient().create(APIInterface.class);


        /**
         GET List Resources
         **/
        Call<MultipleResource> call = apiInterface.doGetListResources();
        call.enqueue(new Callback<MultipleResource>() {
            @Override
            public void onResponse(Call<MultipleResource> call, Response<MultipleResource> response) {


                Log.d("TAG", response.code() + "");

                String displayResponse = "";

                MultipleResource resource = response.body();
                String text = resource.name;
                String t = resource.country;

                List<MultipleResource.Datum> datumList = resource.data;
               //datumList.add(new MultipleResource("M","US"));
               // displayResponse += " City" + text + "\n" + " Country" + t + "\n";

                for (MultipleResource.Datum datum : datumList) {
                    displayResponse += "City" + datum.name + "" + "Country " + datum.country+"\n";
                }



                responseText.setText(displayResponse);

            }

            @Override
            public void onFailure(Call<MultipleResource> call, Throwable t) {
                call.cancel();
            }
        });


    }
}
