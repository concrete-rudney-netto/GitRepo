package com.gitrepo.api;

import android.app.Application;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by izabela on 1/7/18.
 */

public class HttpClient {

    RepoService api;

    public HttpClient() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/search/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(RepoService.class);
    }

    public void getRepo(Callback<com.gitrepo.model.Application> callback) {

        Call<com.gitrepo.model.Application> call = api.getRepo();
        call.enqueue(callback);

    }
}

