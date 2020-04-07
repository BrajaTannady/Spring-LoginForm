package com.example.SpringLoginForm.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "Account")
public class Account {
  @Id
  private String id;
  private String email;
  private String password;
  private String name;
  private String gender;
  private int age;
}
