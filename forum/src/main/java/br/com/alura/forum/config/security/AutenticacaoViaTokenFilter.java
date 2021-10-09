package br.com.alura.forum.config.security;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AutenticacaoViaTokenFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

        String token = recuperarToken(httpServletRequest);

        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }

    private String recuperarToken(HttpServletRequest httpServletRequest) {

        String token = httpServletRequest.getHeader("Authorization");

        return null;eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJBUEkgZG8gZm9ydW0gZGEgQWx1cmEiLCJzdWIiOiIxIiwiaWF0IjoxNjMzNjI0OTA2LCJleHAiOjE2MzM3MTEzMDZ9.hl8F0FxZv9ypbBJEm9ODizliazjn24zYRx4QDMWP6tEarkl1835
    }
}
