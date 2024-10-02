package com.proyIntUdeA.proyectoIntegradorI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    private long subject_id;
    private long degree_id;
    private String subject_name;
}
