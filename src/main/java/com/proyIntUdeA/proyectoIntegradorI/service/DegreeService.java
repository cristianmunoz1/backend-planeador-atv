package com.proyIntUdeA.proyectoIntegradorI.service;

import com.proyIntUdeA.proyectoIntegradorI.model.Degree;

import java.util.List;

public interface DegreeService {
    Degree saveDegree(Degree degree);

    List<Degree> getAllDegree();

    Degree getDegreeById(Long id);

    boolean deleteDegree(Long id);

    Degree updateDegree(Long id, Degree degree);
}
