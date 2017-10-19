package com.prog.springgleb.service;

import com.prog.springgleb.domain.Person;
import com.prog.springgleb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person addPerson(Person person) {
        Person savedPerson = personRepository.saveAndFlush(person);

        return savedPerson;
    }

    @Override
    public Person getPersonById(long id) {
        return personRepository.findOne(id);
    }

    @Override
    public void delete(long id) {
        personRepository.delete(id);
    }

    //@Override
    //public Person getByName(String firstName) {
    //    return PersonRepository.findByfirstName(firstName);
   // }

    @Override
    public Person editPerson(Person person) {
        return  personRepository.saveAndFlush(person);
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }


  //  private JdbcTemplate jdbcTemplate;

   // @Autowired
   // public void setDataSource(DataSource dataSource){
  //      this.jdbcTemplate = new JdbcTemplate(dataSource);
  //  }
  //  public void insert(Person person){
  //      String sql = "insert into person (firstName,lastName) VALUES (?, ?)";
      //  jdbcTemplate.update(sql, new Object[]{person.getFirstName(), person.getLastName()});
   // }




}
