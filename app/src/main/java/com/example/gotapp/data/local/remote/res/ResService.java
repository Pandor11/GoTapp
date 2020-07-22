package com.example.gotapp.data.local.remote.res;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ResService {
    @GET("characters/{id}")
    Call<List<CharacterRes>> getCharacterListById(@Path("id") String charId);

    @GET("houses")
    Call<List<HouseRes>> getHouseByName(@Path("id") String charId);
}
