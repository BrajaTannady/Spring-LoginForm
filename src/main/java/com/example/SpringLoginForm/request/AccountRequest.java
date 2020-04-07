package com.example.SpringLoginForm.request;

import lombok.Data;

@Data
public class AccountRequest {
  private String id;
  private String email;
  private String password;
  private String name;
  private String gender;
  private int age;
}
