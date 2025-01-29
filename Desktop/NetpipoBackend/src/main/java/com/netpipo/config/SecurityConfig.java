package com.netpipo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import jakarta.servlet.Filter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeHttpRequests()
            .requestMatchers("/auth/**").permitAll() // Allow authentication
            .requestMatchers(HttpMethod.GET, "/employees/**").hasAnyAuthority("USER", "ADMIN") // Users & Admins
            .requestMatchers(HttpMethod.POST, "/employees/**").hasAuthority("ADMIN") // Only Admins
            .requestMatchers(HttpMethod.PUT, "/employees/**").hasAuthority("ADMIN") // Only Admins
            .requestMatchers(HttpMethod.DELETE, "/employees/**").hasAuthority("ADMIN") // Only Admins
            .anyRequest().authenticated()
            .and()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
    
        return http.build();
    }

    private Filter jwtAuthenticationFilter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jwtAuthenticationFilter'");
    }
}
