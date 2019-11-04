package com.adcubum.optlocking.repository;

import com.adcubum.optlocking.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {
}

