package com.example.SpringLoginForm.repository;

import com.example.SpringLoginForm.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
  Account findByEmail(String email);
}
