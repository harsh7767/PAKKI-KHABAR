package com.example.pakkikhabar;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    private static Retrofit retrofit =null;


    public static ApiInteraface getApiInterface()
    {
        if (retrofit==null)
        {
          retrofit= new Retrofit.Builder().baseUrl(ApiInteraface.BASE_URl).addConverterFactory(GsonConverterFactory.create()).build();


        }
return retrofit.create(ApiInteraface.class);
    }

}
