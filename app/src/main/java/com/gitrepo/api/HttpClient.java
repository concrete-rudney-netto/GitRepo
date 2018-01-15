package com.gitrepo.api;

import com.gitrepo.model.Application;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by izabela on 1/7/18.
 */

public class HttpClient {

    RepoService api;
    public String name;
    public String login;

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

    public void getRepoPull(Callback<List<Application>> callback) {

        Call<List<Application>> call = api.getRepoPull(login, name);
        call.enqueue(callback);

    }
}

