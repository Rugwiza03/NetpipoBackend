package com.netpipo.controller;

import com.netpipo.dto.AuthRequest;
import com.netpipo.dto.AuthResponse;
import com.netpipo.entity.Role;
import com.netpipo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody AuthRequest request, @RequestParam Role role) {
        authService.register(request, role);
        return "User registered successfully with role: " + role;
    }
    
    

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return authService.login(request);
    }
}
