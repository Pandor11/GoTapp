package com.example.gotapp.data.local.remote.res;

import com.example.gotapp.utils.AppConfig;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
            .baseUrl(AppConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createNetworkService(Class<S> serviceClass){

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        httpClient.addInterceptor(loggingInterceptor);

        Retrofit retrofit = retrofitBuilder
                .client(httpClient.build())
                .build();
        return retrofit.create(serviceClass);
    }
}
