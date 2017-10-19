package com.prog.springgleb.repository;

import com.prog.springgleb.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
   // @Query("select b from Person b where b.firstname = :firstname")
    //Person findByfirstname(@Param("firstname") String firstname);
}
