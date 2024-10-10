package com.proyIntUdeA.proyectoIntegradorI.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    String user_id;
    String user_id_type;
    String user_firstname;
    String user_lastname;
    String userEmail;
    String user_password;
    String user_phone;
    String user_department;
    String user_city;
    String user_state;
    String user_role;
}
