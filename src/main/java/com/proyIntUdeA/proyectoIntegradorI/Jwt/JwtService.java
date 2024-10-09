package com.proyIntUdeA.proyectoIntegradorI.Jwt;

import java.util.HashMap;
import java.util.Map;
import java.security.Key;
import java.util.Date;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

    private static final String SECRET_KEY = "asd1a6sd51as6d5a1d6a5d1a65d1as65d1a65165165479798498";

    public String getToken(UserDetails person) {
        return getToken(new HashMap<>(), person);
    }

    private String getToken(Map<String, Object> extraClaims, UserDetails person) {
        return Jwts
                .builder()
                .setClaims(extraClaims)
                .setSubject(person.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    private Key getKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

}
