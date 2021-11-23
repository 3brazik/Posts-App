package com.example.fackbookv2.Data;

import com.example.fackbookv2.pojo.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
    @GET ("posts")
    public Call<List<PostModel>> getPosts ();
}
