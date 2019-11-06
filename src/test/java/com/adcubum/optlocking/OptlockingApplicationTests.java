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

		personService.save(person);
		contractService.save(contract);

		person = personService.find(person.id);
		contract = contractService.find(contract.id);
	}

}
