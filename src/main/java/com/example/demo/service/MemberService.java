package com.example.demo.service;

import com.example.demo.dto.JwtToken;

public interface MemberService {
    public JwtToken signIn(String username, String password);
}
