// package com.netpipo;

// import java.io.IOException;
// import java.util.List;
// import java.util.Optional;

// import org.apache.catalina.User;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.jdbc.support.JdbcUtil;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
// import org.springframework.stereotype.Component;
// import org.springframework.web.filter.OncePerRequestFilter;



// import jakarta.servlet.FilterChain;
// import jakarta.servlet.ServletException;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

// @Component
// public class JwtAuthenticationFilter extends OncePerRequestFilter {

//     @Autowired
//     private JdbcUtil jwtUtil;

//     @Override
//     protected void doFilterInternal(@SuppressWarnings("null") HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//             throws ServletException, IOException {
        
//         String authHeader = request.getHeader("Authorization");
        
//         if (authHeader == null || !authHeader.startsWith("Bearer ")) {
//             filterChain.doFilter(request, response);
//             return;
//         }

//         String token = authHeader.substring(7);
//         String username = jwtUtil.extractUsername(token);
//         String role = jwtUtil.extractRole(token);

//         if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//             Optional<User> userDetails = Optional.empty();

//             if (userDetails.isPresent() && jwtUtil.validateToken(token, username)) {
//                 UsernamePasswordAuthenticationToken authentication = 
//                     new UsernamePasswordAuthenticationToken(username, null, List.of(new SimpleGrantedAuthority(role)));

//                 authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                 SecurityContextHolder.getContext().setAuthentication(authentication);
//             }
//         }

//         filterChain.doFilter(request, response);
//     }
// }
