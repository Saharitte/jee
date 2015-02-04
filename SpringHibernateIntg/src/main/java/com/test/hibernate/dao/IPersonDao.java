package com.test.hibernate.dao;

import java.util.List;

import com.test.hibernate.model.Person;

public interface IPersonDao {
	 public void save(Person p);
     
	    public List<Person> list();
	     
	    public Person getPersonById(int id);
	    
	    public boolean updatePerson(Person person) ;

	    public void deletePersonById(int id);
}
