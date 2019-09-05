package com.blitznihar.db.cruds;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByPersonId(long personId);
    
}