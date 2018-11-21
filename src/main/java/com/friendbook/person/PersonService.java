package com.friendbook.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
	private PersonRepository repo;
	
	public List<Person> getAllPersons() {
		List<Person> people = new ArrayList<>();
		repo.findAll().forEach(people::add);
		return people;
	}
	
	public void addPerson(Person person) {
		repo.save(person);
	}
	

}
