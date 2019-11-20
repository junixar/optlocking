package com.adcubum.migration.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adcubum.migration.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;

@Service
@Transactional
public class PersonService {

   @Autowired
   private PersonRepository personRepository;

   @Autowired
   private EntityManager entityManager;

   public void save(Person Person) {
      personRepository.save(Person);
   }

   public Person find(String id) {
      return entityManager.find(Person.class, id);
   }

}
