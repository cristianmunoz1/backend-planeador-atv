package com.proyIntUdeA.proyectoIntegradorI.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    private String student_id;
    private String tutor_id;
    private long subject_id;
    private String class_topics;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date class_date;
    private float class_rate;
}
