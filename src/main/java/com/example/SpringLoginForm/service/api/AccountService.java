package com.example.SpringLoginForm.service.api;

import com.example.SpringLoginForm.entity.Account;

public interface AccountService{
  void registerAccount(Account account);
  Account loginAccount(String email, String password);
  void updateAccount(String email, String password, Account account);
  void deleteAccount(String email, String password);
}
