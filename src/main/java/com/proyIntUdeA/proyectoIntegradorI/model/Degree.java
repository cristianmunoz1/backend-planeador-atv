package com.proyIntUdeA.proyectoIntegradorI.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Degree {
    private Long degree_id;
    private String degree_name;
    private String degree_modality;
    private String degree_department;

    public Degree() {
    }

    public Degree(Long degree_id, String degree_name, String degree_modality, String degree_department) {
        this.degree_id = degree_id;
        this.degree_name = degree_name;
        this.degree_modality = degree_modality;
        this.degree_department = degree_department;
    }
}
