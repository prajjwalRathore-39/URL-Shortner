package com.url.url_shortner_sb.security.jwt;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try{
            // Get JWT from the header
            // Validate the token
            // if Valid User details
                // --get username --> load user --> Set the auth context


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
