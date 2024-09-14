package com.proyIntUdeA.proyectoIntegradorI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Degree {
    private long degree_id;
    private String degree_name;
    private String degree_modality;
    private String degree_department;
}
