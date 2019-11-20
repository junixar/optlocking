package com.adcubum.migration.repository;

import org.springframework.data.repository.CrudRepository;

import com.adcubum.migration.domain.Person;

public interface PersonRepository extends CrudRepository<Person, String> {
}

