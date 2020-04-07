package com.example.SpringLoginForm.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseResponse {
private boolean success;
private String errorMessage;
}
