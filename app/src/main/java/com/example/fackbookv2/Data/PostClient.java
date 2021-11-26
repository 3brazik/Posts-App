package com.example.fackbookv2.Data;

import com.example.fackbookv2.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostClient {
    private final static String BASE_URl="https://jsonplaceholder.typicode.com";
    private static PostClient INSTANC;
    private PostInterface postInterface;
    private static PostClient getInstance;



    public PostClient (){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URl).addConverterFactory(GsonConverterFactory.create()).build();

        postInterface =retrofit.create(PostInterface.class);

    }

    public static PostClient getGetInstance() {
        if (null==INSTANC){
            INSTANC=new PostClient();

        }
        return INSTANC;
    }
    public Call<List<PostModel>> getPosts (){
        return postInterface.getPosts();
        ////

    }
}
