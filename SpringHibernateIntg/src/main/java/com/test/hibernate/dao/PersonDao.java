package com.test.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.test.hibernate.model.Person;


@Repository
public class PersonDao extends HibernateDaoSupport implements IPersonDao {

	
	
	@Autowired
	public void init(SessionFactory factory) {
	    setSessionFactory(factory);
	}
	@Override
	public void save(Person p) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(p);

	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub

		return getHibernateTemplate().get(Person.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> list() {
		// TODO Auto-generated method stub
		return (List<Person>) getHibernateTemplate().find("from Person");

	}

	@Override
	public void deletePersonById(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(
				getHibernateTemplate().get(Person.class, id));
	}

	@Override
	public boolean updatePerson(Person person) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(person);
		return true;
	}
}
