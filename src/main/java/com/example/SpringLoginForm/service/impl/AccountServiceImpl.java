package com.example.SpringLoginForm.service.impl;

import com.example.SpringLoginForm.entity.Account;
import com.example.SpringLoginForm.repository.AccountRepository;
import com.example.SpringLoginForm.service.api.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
  @Autowired
  private AccountRepository accountRepository;

  @Override
  public void registerAccount(Account account) {
    accountRepository.save(account);
  }

  @Override
  public Account loginAccount(String email, String password) {
    Account existingAccount = accountRepository.findByEmail(email);
    if (existingAccount.getPassword().equals(password)){
      return existingAccount;
    }
    return null;
  }

  @Override
  public void updateAccount(String email, String password, Account updatedAccount) {
    Account existingAccount = accountRepository.findByEmail(email);
    if (existingAccount.getPassword().equals(password)){
      existingAccount.setEmail(updatedAccount.getEmail());
      existingAccount.setPassword(updatedAccount.getPassword());
      existingAccount.setName(updatedAccount.getName());
      existingAccount.setGender(updatedAccount.getGender());
      existingAccount.setAge(updatedAccount.getAge());
      accountRepository.save(existingAccount);
    }
  }

  @Override
  public void deleteAccount(String email, String password) {
    Account existingAccount = accountRepository.findByEmail(email);
    if (existingAccount.getPassword().equals(password)){
      accountRepository.deleteById(existingAccount.getId());
    }
  }
}
