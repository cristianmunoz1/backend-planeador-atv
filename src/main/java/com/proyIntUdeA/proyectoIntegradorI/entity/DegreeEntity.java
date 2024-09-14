package com.proyIntUdeA.proyectoIntegradorI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "degree")
public class DegreeEntity {
    @Id
    public String degree_id;
    public String degree_name;
    public String degree_modality;
    public String degree_department;
}

