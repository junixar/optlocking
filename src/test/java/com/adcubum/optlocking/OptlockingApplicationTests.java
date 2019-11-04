package com.adcubum.optlocking;

import com.adcubum.optlocking.domain.Contract;
import com.adcubum.optlocking.domain.Person;
import com.adcubum.optlocking.repository.ContractService;
import com.adcubum.optlocking.repository.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class OptlockingApplicationTests {

	@Autowired
	private PersonService personService;

	@Autowired
	private ContractService contractService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Person person = new Person();
		person.id = UUID.randomUUID().toString();
		person.name = "testName";

		Contract contract = new Contract();
		contract.id = UUID.randomUUID().toString();
		contract.name = "testContract";

		person.contracts = new ArrayList<>();
		person.contracts.add(contract);

		personService.save(person);

		person = personService.find(person.id);
		person.contracts.forEach(cntrct -> {
			cntrct.name = "changedContractName0";
		});
		personService.save(person);

		person = personService.find(person.id);
		person.contracts.forEach(cntrct -> {
			cntrct.name = "changedContractName1";
		});
		personService.save(person);

		person = personService.find(person.id);
		person.contracts.forEach(cntrct -> {
			cntrct.name = "changedContractName2";
		});
		personService.save(person);
	}

}
