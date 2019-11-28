package com.hitit.githubclient.api;

import com.hitit.githubclient.model.response.ContributorsRest;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface RetroGithubAPI {
    @GET("repos/{owner}/{repo}/contributors")
    Call<List<ContributorsRest>> getContributors(@Path("owner") String owner, @Path("repo") String repo);
}
