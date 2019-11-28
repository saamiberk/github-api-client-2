package com.hitit.githubclient.service;

import com.hitit.githubclient.model.response.ContributorsRest;

import java.io.IOException;

public interface GithubService {
    ContributorsRest getTopContributor(String owner, String repo) throws IOException;
}
