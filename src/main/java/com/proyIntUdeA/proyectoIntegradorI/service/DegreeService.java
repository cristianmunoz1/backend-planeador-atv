package com.proyIntUdeA.proyectoIntegradorI.service;

import com.proyIntUdeA.proyectoIntegradorI.model.Degree;

import java.util.List;

public interface DegreeService {
    Degree saveDegree(Degree degree);

    List<Degree> getAllDegree();

    Degree getDegreeById(String id);

    boolean deleteDegree(String id);

    Degree updateDegree(String id, Degree degree);
}
