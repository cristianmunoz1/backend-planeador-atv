package com.proyIntUdeA.proyectoIntegradorI.Auth;

import org.springframework.stereotype.Service;

import com.proyIntUdeA.proyectoIntegradorI.Jwt.JwtService;
import com.proyIntUdeA.proyectoIntegradorI.entity.PersonEntity;
import com.proyIntUdeA.proyectoIntegradorI.repository.PersonRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final PersonRepository personRepository;
    private final JwtService jwtService;

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {
        PersonEntity person = PersonEntity.builder()
                .user_name(request.getUser_name())
                .user_id(request.getUser_id())
                .user_id_type(request.getUser_id_type())
                .user_name(request.getUser_name())
                .user_lastname(request.getUser_lastname())
                .user_email(request.getUser_email())
                .user_password(request.getUser_password())
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
