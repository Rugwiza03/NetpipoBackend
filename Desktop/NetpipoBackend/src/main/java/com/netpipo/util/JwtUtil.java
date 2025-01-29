// package com.netpipo.util;

// import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Jaas;
// import org.springframework.stereotype.Component;

// import java.util.Date;

// import javax.xml.crypto.dsig.XMLSignature.SignatureValue;

// @Component
// public class JwtUtil<Claims> {
//     private static final String SECRET_KEY = "your_secret_key";

//     public String generateToken(String username) {
//         return Jaas.builder()
//                 .setSubject(username)
//                 .setIssuedAt(new Date())
//                 .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
//                 .signWith(SignatureValue.HS256, SECRET_KEY)
//                 .compact();
//     }

//     public Claims extractClaims(String token) {
//         return Jaas.parser()
//                 .setSigningKey(SECRET_KEY)
//                 .parseClaimsJws(token)
//                 .getBody();
//     }

//     public String extractUsername(String token) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'extractUsername'");
//     }

//     public String extractRole(String token) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'extractRole'");
//     }

//     public boolean validateToken(String token, String username) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'validateToken'");
//     }
// }
