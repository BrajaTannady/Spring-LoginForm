package com.example.SpringLoginForm.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountResponse {
  private String id;
  private String email;
  private String password;
  private String name;
  private String gender;
  private int age;
}
