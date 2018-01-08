package com.gitrepo.api;

import com.gitrepo.model.Application;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by izabela on 1/7/18.
 */

public interface RepoService {

    @GET("repositories?q=language:Java&sort=stars&page=1")
    Call<Application> getRepo();
}
