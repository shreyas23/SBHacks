package com.budget.sbhacks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.volley.*;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import retrofit2.Response;

/**
 * Created by Shreyas Niradi on 1/20/2017.
 * hoh
 */

public class Homepage extends AppCompatActivity /*implements AuthenticationListener*/ {

    //AuthenticationDialog dialog;

    public static final String PX_URL = "https://api.500px.com/v1/";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Nithin: creating a dialogue for instagram authentication
        /*dialog = new AuthenticationDialog(Homepage.this, this);
        dialog.show();*/

        //Querries for 500px
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://api.500px.com/v1/photos/search?consumer_key=b0zEZR7DjvVKcGQwq8bmldiwGwsuE3Y8013tOCI6&term=landscape";

    // Request a string response from the provided URL.

        com.android.volley.Response.Listener<String> responseListener = new com.android.volley.Response.Listener<String>(){
            @Override
            public void onResponse(String response) {
                // Display the first 500 characters of the response string.
                Log.d("Response is: ", response.substring(0,500));
            }
        };

        com.android.volley.Response.ErrorListener errorListener = new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error: ", "That didn't work!");
            }
        };
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                responseListener, errorListener);
    // Add the request to the RequestQueue.
        queue.add(stringRequest);

        //Aditya: retrofit stuff for 500px
        /*Response<Result> photoList;
        try {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(PX_URL).
                    addConverterFactory(GsonConverterFactory.create()).
                            build();
            GetPhotos getPhotos = retrofit.create(GetPhotos.class);

            Call<Result> call = getPhotos.getPhotos("b0zEZR7DjvVKcGQwq8bmldiwGwsuE3Y8013tOCI6", "landscape");

            Log.d("Success? ", "success!");

            String request = call.request().toString();

            Log.d("Request Info: ", request);

            photoList = call.execute();
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("Exception:", "exception!");
        }*/
    }

    /*@Override
    public void onCodeReceived(String code) {
        if (code != null) {
            dialog.dismiss();
        }
    }*/
}
