package com.proyIntUdeA.proyectoIntegradorI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {
    private String user_id;
    private String user_id_type;
    private String user_firstname;
    private String user_lastname;
    private String userEmail;
    private String user_password;
    private String user_phone;
    private String user_department;
    private String user_city;
    private String user_state;
    private String user_role;
}
