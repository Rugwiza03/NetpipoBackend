package com.netpipo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    
    public String authenticateUser(String username, String password) {
        // Dummy authentication logic
        return "JWT_TOKEN"; // Replace this with real JWT token logic
    }
}
