package com.adcubum.migration;

import java.util.UUID;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import com.adcubum.migration.domain.Person;
import com.adcubum.migration.repository.PersonRepository;

public class V4__Insert extends BaseJavaMigration {
    public void migrate(Context context) throws Exception {
    	Person p = new Person();
    	p.id = UUID.randomUUID().toString();
    	p.firstname = "elvis4";
    	PersonRepository personRepo = SpringUtility.getBean(PersonRepository.class);
    	personRepo.save(p);
    }
}


