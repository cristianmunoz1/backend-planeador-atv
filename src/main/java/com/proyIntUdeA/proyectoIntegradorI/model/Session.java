package com.proyIntUdeA.proyectoIntegradorI.model;
import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date class_date;
    private float class_rate;
}
