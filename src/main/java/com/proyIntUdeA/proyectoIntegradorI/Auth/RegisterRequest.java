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
    String user_name;
    String user_lastname;
    String user_email;
    String user_password;
    String user_phone;
    String user_department;
    String user_city;
    String user_state;
    String user_role;
}
