package com.adcubum.migration;

import java.util.Iterator;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import com.adcubum.migration.domain.Person;
import com.adcubum.migration.repository.PersonRepository;


public class V6__Alter extends BaseJavaMigration {
	
    public void migrate(Context context) throws Exception {
    	PersonRepository personRepo = SpringUtility.getBean(PersonRepository.class);
    	Iterable<Person> allPersons = personRepo.findAll();
    	Iterator<Person> iterator = allPersons.iterator();
    	Person p = iterator.hasNext() ? iterator.next() : null; 
    	p.firstname = "Alteredelvis5";
    	personRepo.save(p);
    }
}


