package com.blitznihar.db.controller;

import java.util.List;

import com.blitznihar.db.cruds.Person;
import com.blitznihar.db.cruds.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public List<Person> retrievePerson(long personId){

        return personRepository.findByPersonId(personId);
        
    }
    @PostMapping("/")
    public boolean createPerson(@RequestBody Person person){
        System.out.println(person);
        personRepository.save(person);
        return true;
        
    }
    
}