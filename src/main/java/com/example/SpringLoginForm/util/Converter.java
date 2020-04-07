package com.example.SpringLoginForm.util;

import com.example.SpringLoginForm.entity.Account;
import com.example.SpringLoginForm.request.AccountRequest;
import com.example.SpringLoginForm.response.AccountResponse;

public class Converter {
  public static AccountResponse convertAccountToAccountResponse(Account account) {
    return AccountResponse.builder()
        .id(account.getId())
        .email(account.getEmail())
        .password(account.getPassword())
        .name(account.getName())
        .gender(account.getGender())
        .age(account.getAge())
        .build();
  }

  public static Account convertAccountRequestToAccount(AccountRequest request) {
    return Account.builder()
        .id(request.getId())
        .email(request.getEmail())
        .password(request.getPassword())
        .name(request.getName())
        .gender(request.getGender())
        .age(request.getAge())
        .build();
  }
}
