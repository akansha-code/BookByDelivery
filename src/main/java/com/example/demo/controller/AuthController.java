package com.example.demo.controller;

import com.example.demo.payload.request.auth.SignUpRequest;
import com.example.demo.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    @Autowired
    private  AuthService authService;
    @PostMapping("/register")
    public SignUpRequest register(@RequestBody SignUpRequest request)
    {

        return authService.register(request);
    }
    @PostMapping("/login")
    public String login()
    {
      return "login";
    }
    @PostMapping("/refreshToken")
    public  String refreshToken()
    {
      return "token received";
    }
    @PostMapping("/logout")
    public String logout()
    {
        return "logout";
    }
}
