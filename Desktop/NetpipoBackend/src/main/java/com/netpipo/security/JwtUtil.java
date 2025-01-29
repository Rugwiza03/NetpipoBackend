// package com.netpipo.security;

// import org.springframework.stereotype.Component;
// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;
// import io.jsonwebtoken.security.Keys;

// import java.security.Key;
// import java.util.Date;

// @Component
// public class JwtUtil {

//     private static final long EXPIRATION_TIME = 86400000; // 24 hours
//     private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256); // Secure key generation

//     public String generateToken(String username) {
//         return Jwts.builder()  // Fixed `Jwt.builder()` to `Jwts.builder()`
//                 .setSubject(username)
//                 .setIssuedAt(new Date())
//                 .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
//                 .signWith(key, SignatureAlgorithm.HS256)
//                 .compact();
//     }

//     public String extractUsername(String token) {
//         return Jwts.parserBuilder().setSigningKey(key).build()
//                 .parseClaimsJws(token).getBody().getSubject();
//     }

//     public boolean validateToken(String token, String username) {
//         return username.equals(extractUsername(token)) && !isTokenExpired(token);
//     }

//     private boolean isTokenExpired(String token) {
//         return Jwts.parserBuilder().setSigningKey(key).build()
//                 .parseClaimsJws(token).getBody().getExpiration().before(new Date());
//     }
// }

import org.apache.commons.lang3.time.DateFormatUtils;

public String generateToken(String username, String role) {
    return Jwts.builder()
            .setSubject(username)
            .claim("role", role) // Add role claim
            .setIssuedAt(new DateFormatUtils())
            .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
            .signWith(key, SignatureAlgorithm.HS256)
            .compact();
}

public String extractRole(String token) {
    return Jwts.parserBuilder().setSigningKey(key).build()
            .parseClaimsJws(token).getBody().get("role", String.class);
}
