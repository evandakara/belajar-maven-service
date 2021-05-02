package com.evan.learning.service.impl.onetoone;

import com.evan.learning.dao.impl.onetoone.PersonDaoImpl;
import com.evan.learning.dao.onetoone.PersonDaoInterface;
import com.evan.learning.model.onetoone.Person;
import com.evan.learning.service.onetoone.PersonServiceInterface;

import java.io.Serializable;
import java.util.List;

public class PersonServiceImpl implements PersonServiceInterface {
    public Person findById(Long id) {
        PersonDaoImpl personDaoImpl = new PersonDaoImpl();
        personDaoImpl.openCurrentSession();
        Person person = personDaoImpl.findById(id);
        personDaoImpl.closeCurrentSession();
        return person;
    }

    public List<Person> findAll() {
        PersonDaoImpl personDao = new PersonDaoImpl();
        personDao.openCurrentSession();
        List<Person> personList = personDao.findAll();

        personDao.closeCurrentSession();
        return personList;
    }
}
