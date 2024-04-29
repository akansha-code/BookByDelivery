package com.example.demo.service;

import com.example.demo.payload.request.auth.SignUpRequest;

public interface AuthService {
    SignUpRequest register(SignUpRequest request);

}
