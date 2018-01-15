package com.gitrepo.api;

import com.gitrepo.model.Application;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by izabela on 1/7/18.
 */

public interface RepoService {

    @GET("repositories?q=language:Java&sort=stars&page=1")
    Call<Application> getRepo();

    @GET("repos/{login}/{name}")
    Call<List<Application>> getRepoPull(@Path("login") String login, @Path("name") String name);

}
