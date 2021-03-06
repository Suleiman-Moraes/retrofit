package com.senaigo.retrofit.interfaces;

import com.senaigo.retrofit.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface UserInterface {
    @GET("users")
    Call<List<User>> get();

    @POST("users")
    Call<User> post(@Body User user);

    @PUT("users/{id}")
    Call<User> put(@Body User user, @Path("id") Integer id);

    @DELETE("users/{id}")
    Call<Void> delete(@Path("id") Integer id);
}
