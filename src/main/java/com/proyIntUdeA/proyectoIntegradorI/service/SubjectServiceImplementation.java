package com.proyIntUdeA.proyectoIntegradorI.service;

import com.proyIntUdeA.proyectoIntegradorI.entity.SubjectEntity;
import com.proyIntUdeA.proyectoIntegradorI.model.Person;
import com.proyIntUdeA.proyectoIntegradorI.model.Subject;
import com.proyIntUdeA.proyectoIntegradorI.repository.SubjectRepository;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class SubjectServiceImplementation implements SubjectService{

    private final SubjectRepository subjectRepository;

    public SubjectServiceImplementation(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }


    @Override
    public Subject saveSubject(Subject subject) {
        SubjectEntity subjectEntity = new SubjectEntity();
        BeanUtils.copyProperties(subject, subjectEntity);
        subjectRepository.save(subjectEntity);
        return subject;
    }

    @Override
    public List<Subject> getAllSubject() {
        return null;
    }

    @Override
    public Subject getSubjectById(long id) {
        return null;
    }

    @Override
    public boolean deleteSubject(long id) {
        return false;
    }

    @Override
    public Subject updateSubject(long id, Subject subject) {
        return null;
    }
}
