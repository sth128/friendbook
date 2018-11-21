package com.friendbook.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@RequestMapping("/friends")
	public List<Person> getAllPersons () {
		return personService.getAllPersons();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/friends")
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}
	
}
