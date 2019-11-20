package com.adcubum.migration;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.adcubum.migration.domain.Person;
import com.adcubum.migration.repository.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class MigrationApplicationTests {

	@Autowired
	private PersonService personService;


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Person person = new Person();
		person.id = UUID.randomUUID().toString();
		person.firstname = "testFirstname";
		person.lastname = "testLastname";

		personService.save(person);
		person = personService.find(person.id);
	}

}
