package com.proyIntUdeA.proyectoIntegradorI.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Session {
    private long class_id;
    private String class_state;
    private String student_id;
    private String tutor_id;
    private long subject_id;
    private String class_topics;
    private Date class_date;
    private float class_rate;
}
