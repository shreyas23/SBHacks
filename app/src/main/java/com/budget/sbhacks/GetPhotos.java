package com.budget.sbhacks;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


/**
 * Created by adityanadkarni on 1/21/17.
 */

public interface GetPhotos {
    @GET("photos/search")
    Call<Result> all();

    @GET("photos/search")
    Call<Result> getPhotos(
            @Query("consumer_key") String key,
            @Query("term") String keyword);

    @GET("photos/{id}/photo")
    Call<Photo> select(@Path("id") int id);
}
