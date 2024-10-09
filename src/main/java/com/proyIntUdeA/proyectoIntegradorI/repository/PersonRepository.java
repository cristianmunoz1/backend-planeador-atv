package com.proyIntUdeA.proyectoIntegradorI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyIntUdeA.proyectoIntegradorI.entity.PersonEntity;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, String> {
    Optional<PersonEntity> findByUsername(String user_name);
}
