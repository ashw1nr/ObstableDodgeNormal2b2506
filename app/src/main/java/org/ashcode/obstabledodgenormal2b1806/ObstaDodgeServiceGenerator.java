package org.ashcode.obstabledodgenormal2b1806;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ObstaDodgeServiceGenerator {
    private static final String BASE_URL = "https://api-obstacle-dodge.vercel.app/";

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());
    private static Retrofit retrofit = builder.build();
    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    public static <S> S createService(Class <S> serviceClass) {
        return retrofit.create(serviceClass);
    }

}


