package com.prog.springgleb.service;

import com.prog.springgleb.domain.Person;

import java.util.List;

public interface PersonService  {

    Person addPerson(Person person);
    void delete(long id);
    //Person getByfirstName(String firstName);
    Person editPerson(Person person);
    List<Person> getAll();

}
