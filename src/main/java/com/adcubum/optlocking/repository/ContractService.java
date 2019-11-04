package com.adcubum.optlocking.repository;

import com.adcubum.optlocking.domain.Contract;
import com.adcubum.optlocking.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;

@Service
@Transactional
public class ContractService {

   @Autowired
   private ContractRepository contractRepository;

   public void save(Contract contract) {
      contractRepository.save(contract);
   }

   public Contract find(String id) {
      return contractRepository.findById(id).get();
   }

}
