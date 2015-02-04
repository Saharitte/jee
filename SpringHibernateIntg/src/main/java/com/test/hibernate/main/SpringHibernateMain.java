package com.test.hibernate.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.hibernate.dao.PersonDao;
import com.test.hibernate.model.Person;

public class SpringHibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        PersonDao personDAO = context.getBean(PersonDao.class);
         
        Person person = new Person();
        person.setName("sassou");
        person.setCountry("Tunisia");
         
        personDAO.save(person);
         
        System.out.println("Person::"+person);
         
        List<Person> list = personDAO.list();
         
        for(Person p : list){
            System.out.println("Person List::"+p);
        }
        
        Person pe =personDAO.getPersonById(1);
        System.out.println("SAluuuuuuuuuuut"+pe.toString());
        
        personDAO.deletePersonById(12);
        System.out.println("============list after deleting================");
        for(Person p1 : personDAO.list()){
            System.out.println("Person List::"+p1);
        } 
        
// update Person
        pe.setName("vaio");
        pe.setCountry("Japan");
        personDAO.updatePerson(pe);
        System.out.println("SAluuuuuuuuuuut after updating"+pe.toString());
        
        //close resources
        context.close();
        
        
        
    }
	}


