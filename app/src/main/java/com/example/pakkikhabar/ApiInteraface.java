package com.example.pakkikhabar;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInteraface {

    String BASE_URl="https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<mainNews> getNews(
            @Query("country")String country,
            @Query("pagesize")int pagesize,
            @Query("apikey") String apikey

    );
    @GET("top-headlines")
    Call<mainNews> getCategoryNews(
            @Query("country")String country,
            @Query("category") String category,
            @Query("pagesize")int pagesize,
            @Query("apikey") String apikey
    );
}
