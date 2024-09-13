package com.proyIntUdeA.proyectoIntegradorI.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.proyIntUdeA.proyectoIntegradorI.entity.PersonEntity;
import com.proyIntUdeA.proyectoIntegradorI.model.Person;
import com.proyIntUdeA.proyectoIntegradorI.repository.PersonRepository;

@Service
public class PersonServiceImplementation implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImplementation(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person savePerson(Person person) {
        PersonEntity personEntity = new PersonEntity();
        BeanUtils.copyProperties(person, personEntity);
        personRepository.save(personEntity);
        return person;
    }

    @Override
    public List<Person> getAllPersons() {
        List<PersonEntity> personEntities = personRepository.findAll();

        List<Person> persons = personEntities.stream().map(personEntity -> new Person(
                personEntity.getUser_id_type(),
                personEntity.getUser_id(),
                personEntity.getUser_name(),
                personEntity.getUser_lastname(),
                personEntity.getUser_city(),
                personEntity.getUser_department(),
                personEntity.getUser_email(),
                personEntity.getUser_phone(),
                personEntity.getUser_role(),
                personEntity.getUser_state(),
                personEntity.getUser_password())).collect(Collectors.toList());
        return persons;
    }

    @Override
    public Person getPersonById(String id) {
        PersonEntity personEntity = personRepository.findById(id).get();
        Person person = new Person();
        BeanUtils.copyProperties(personEntity, person);
        return person;
    }

    @Override
    public boolean deletePerson(String id) {
        PersonEntity person = personRepository.findById(id).get();
        personRepository. delete(person);
        return true;
    }

    @Override
    public Person updatePerson(String id, Person person) {
        PersonEntity personEntity = personRepository.findById(id).get();
        personEntity.setUser_city(person.getUser_city());
        personEntity.setUser_department(person.getUser_department());
        personEntity.setUser_email(person.getUser_email());
        personEntity.setUser_lastname(person.getUser_lastname());
        personEntity.setUser_name(person.getUser_name());
        personEntity.setUser_password(person.getUser_password());
        personEntity.setUser_phone(person.getUser_phone());
        personEntity.setUser_phone(person.getUser_phone());
        personEntity.setUser_role(person.getUser_role());
        personEntity.setUser_state(person.getUser_state());

        personRepository.save(personEntity);
        return person;
    }
}
