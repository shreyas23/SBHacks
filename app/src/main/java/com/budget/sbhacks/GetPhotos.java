package com.budget.sbhacks;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


/**
 * Created by adityanadkarni on 1/21/17.
 */

public interface GetPhotos {
    @GET("photos/search")
    Call<Result> all();

    @GET("photos/{id}/photo")
    Call<Photo> select(@Path("id") int id);
}
