package com.proyIntUdeA.proyectoIntegradorI.service;

import com.proyIntUdeA.proyectoIntegradorI.model.Degree;

import java.util.List;

public interface DegreeService {
    Degree saveDegree(Degree degree);

    List<Degree> getAllDegree();

    Degree getDegreeById(long id);

    boolean deleteDegree(long id);

    Degree updateDegree(long id, Degree degree);
}
