//package com.example.SpringLoginForm.controller;
//
//import com.example.SpringLoginForm.client.GitClient;
//import com.example.SpringLoginForm.client.Github;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ClientController {
//
//  @Autowired
//  private GitClient gitClient;
//
//  @PostMapping("/access_token")
//  public Github token(@RequestParam String client_id, String client_secret, String code){
//    return gitClient.accessToken(client_id, client_secret, code);
//  }
//}
