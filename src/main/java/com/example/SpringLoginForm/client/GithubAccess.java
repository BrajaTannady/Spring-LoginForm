package com.example.SpringLoginForm.client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GithubAccess {
  private String access_token;
  private String token_type;
}
