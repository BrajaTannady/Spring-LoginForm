package com.example.SpringLoginForm.client;

import kong.unirest.Unirest;
import org.springframework.stereotype.Service;

@Service
public class GithubClientImpl implements GithubClient {
  @Override
  public GithubAccess getAccessToken(String client_id, String client_secret, String code) {
    String response = Unirest
        .post(
            "https://github.com/login/oauth/access_token?client_id={clientID}"
                + "&client_secret={clientSecret}&code={code}")
        .routeParam("clientID", client_id)
        .routeParam("clientSecret", client_secret)
        .routeParam("code", code)
        .asString()
        .getBody();
    return convertStringToObject(response);
  }

  @Override
  public GithubResponse getUserInfo(GithubAccess githubAccess) {
    return Unirest
        .get(
            "https://api.github.com/user")
        .basicAuth("user", githubAccess.getAccess_token())
        .asObject(GithubResponse.class)
        .getBody();
  }

  private GithubAccess convertStringToObject(String response) {
    String[] getTokenType = response.split("=");
    String[] getAccessType = getTokenType[1].split("&");
    String access_token = getAccessType[0];
    String token_type = getTokenType[3];

    return GithubAccess.builder()
        .access_token(access_token)
        .token_type(token_type)
        .build();
  }

}
