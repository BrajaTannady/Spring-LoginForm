package com.example.SpringLoginForm.controller;

import com.example.SpringLoginForm.entity.Account;
import com.example.SpringLoginForm.request.AccountRequest;
import com.example.SpringLoginForm.response.AccountResponse;
import com.example.SpringLoginForm.response.BaseResponse;
import com.example.SpringLoginForm.service.api.AccountService;
import com.example.SpringLoginForm.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
  @Autowired
  private AccountService accountService;

  @GetMapping("/loginAccount")
  public AccountResponse loginAccount(@RequestParam String email, String password) {
    Account account = accountService.loginAccount(email, password);
    return Converter.convertAccountToAccountResponse(account);
  }

  @PostMapping("/registerAccount")
  public BaseResponse registerAccount(@RequestBody AccountRequest request) {
    Account account = Converter.convertAccountRequestToAccount(request);
    try {
      accountService.registerAccount(account);
      return new BaseResponse(true, null);
    } catch (Exception ex) {
      return new BaseResponse(false, ex.getMessage());
    }
  }

  @PostMapping("/updateAccount")
  public BaseResponse updateAccount(@RequestParam String email, String password, @RequestBody AccountRequest request) {
    Account account = Converter.convertAccountRequestToAccount(request);
    try {
      accountService.updateAccount(email, password, account);
      return new BaseResponse(true, null);
    } catch (Exception ex) {
      return new BaseResponse(false, ex.getMessage());
    }
  }

  @DeleteMapping("/DeleteAccount")
  public BaseResponse deleteAccount(@RequestParam String email, String password) {
    try {
      accountService.deleteAccount(email, password);
      return new BaseResponse(true, null);
    } catch (Exception ex) {
      return new BaseResponse(false, ex.getMessage());
    }
  }
}
