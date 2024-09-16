package com.proyIntUdeA.proyectoIntegradorI.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "class")
public class SessionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long class_id;
    private String class_state;
    private long student_id;
    private long tutor_id;
    private long subject_id;
    private String class_topics;
    private Date class_date;
    private float class_rate;
}
