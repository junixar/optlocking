package com.adcubum.optlocking.repository;

import com.adcubum.optlocking.domain.Contract;
import com.adcubum.optlocking.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface ContractRepository extends CrudRepository<Contract, String> {
}

