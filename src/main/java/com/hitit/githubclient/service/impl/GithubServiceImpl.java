package com.hitit.githubclient.service.impl;

import com.hitit.githubclient.api.RetroGithubAPI;
import com.hitit.githubclient.exceptions.ServiceException;
import com.hitit.githubclient.model.response.ContributorsRest;
import com.hitit.githubclient.model.response.ErrorMessages;
import com.hitit.githubclient.service.GithubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Service
public class GithubServiceImpl implements GithubService {

    @Autowired
    private RetroGithubAPI retroGithubAPI;

    @Override
    public ContributorsRest getTopContributor(String owner, String repo) throws IOException {

        ContributorsRest returnValue = new ContributorsRest();

        Call<List<ContributorsRest>> call = retroGithubAPI.getContributors(owner, repo);
        Response<List<ContributorsRest>> response = call.execute();

        if (!response.isSuccessful()) throw new ServiceException(ErrorMessages.NO_RECORD_FOUND.getErrorMessages());
        if (response.body() != null) returnValue = response.body().get(response.body().size()-1); // get most contributor
        return returnValue;
    }
}
