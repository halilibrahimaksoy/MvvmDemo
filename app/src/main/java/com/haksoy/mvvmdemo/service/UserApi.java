package com.haksoy.mvvmdemo.service;

import com.haksoy.mvvmdemo.model.UserListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserApi {
    @GET("api/")
    Call<UserListResponse> getAnnounce(@Query("nat") String nat, @Query("results") Integer count);
}
