package com.example.SpringLoginForm.client;

public interface GithubClient {
  GithubAccess getAccessToken(String client_id,
      String client_secret, String code);
  GithubResponse getUserInfo(GithubAccess githubAccess);
}
