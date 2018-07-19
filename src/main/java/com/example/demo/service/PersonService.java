package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repo;
	
	public List<Person> findAll()
	{
		List<Person> persons=new ArrayList<>();
		repo.findAll().forEach(persons::add);
		return persons;
	}
	
	public Optional<Person> findOne(int id)
	{
		return repo.findById(id);
	}
	
	public Person addPerson(Person person)
	{
		repo.save(person);
		return person;
	}
	
	public Person UpdateOne(Person person, int id)
	{
		return repo.save(person);
	}
	
	public int deleteOne(int id)
	{
		repo.deleteById(id);
		return id;
	}

}
