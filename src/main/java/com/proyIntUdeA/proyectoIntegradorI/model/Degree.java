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


    public Degree(Long degree_id, String degree_name, String degree_modality, String degree_department) {
        this.degree_id = degree_id;
        this.degree_name = degree_name;
        this.degree_modality = degree_modality;
        this.degree_department = degree_department;
    }
}
