package com.evan.learning.service.onetoone;

import com.evan.learning.model.onetoone.Person;

import java.util.List;

public interface PersonServiceInterface {
    public Person findById(Long id);

    public List<Person> findAll();
}
