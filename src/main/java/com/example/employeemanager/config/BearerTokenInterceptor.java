package com.example.employeemanager.config;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class BearerTokenInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletRequest response, Object handler) throws Exception{
		String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
        if ("Bearer myauthcode".equals(authHeader)) {
            return true;
        } else {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }
    }
}
