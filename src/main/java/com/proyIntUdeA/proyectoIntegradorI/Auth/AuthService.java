package com.proyIntUdeA.proyectoIntegradorI.Auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.proyIntUdeA.proyectoIntegradorI.Jwt.JwtService;
import com.proyIntUdeA.proyectoIntegradorI.entity.PersonEntity;
import com.proyIntUdeA.proyectoIntegradorI.repository.PersonRepository;
import lombok.RequiredArgsConstructor;

import java.sql.SQLOutput;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final PersonRepository personRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUser_email(), request.getUser_password()));
        UserDetails user = personRepository.findByUserEmail(request.getUser_email()).orElseThrow();
        String token = jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();

    }

    public AuthResponse register(RegisterRequest request) {
        PersonEntity person = PersonEntity.builder()
                .user_firstname(request.getUser_firstname())
                .user_id(request.getUser_id())
                .user_id_type(request.getUser_id_type())
                .user_lastname(request.getUser_lastname())
                .userEmail(request.getUserEmail())
                .user_password(passwordEncoder.encode(request.getUser_password()))
                .user_phone(request.getUser_phone())
                .user_department(request.getUser_department())
                .user_city(request.getUser_city())
                .user_state(request.getUser_state())
                .user_role(request.getUser_role())
                .build();

        personRepository.save(person);

        return AuthResponse.builder()
                .token(jwtService.getToken(person))
                .build();
    }

}
