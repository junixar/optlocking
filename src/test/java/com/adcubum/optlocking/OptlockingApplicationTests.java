package com.adcubum.optlocking;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.adcubum.optlocking.domain.Person;
import com.adcubum.optlocking.repository.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class OptlockingApplicationTests {

	@Autowired
	private PersonService personService;


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Person person = new Person();
		person.id = UUID.randomUUID().toString();
		person.firstname = "testName";

		personService.save(person);
		person = personService.find(person.id);
	}

}
