package com.freemusic.musicwebcommon.threads;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Arrays;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userId = request.getHeader("X-User-Id");
        String roles = request.getHeader("X-Roles");

        UserContext context = UserContextHolder.getContext();
        context.setUserId(userId);
        context.setRoles(Arrays.asList(roles.split(",")));

        return true;
    }


}
