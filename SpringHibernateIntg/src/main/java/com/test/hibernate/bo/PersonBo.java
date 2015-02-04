package com.test.hibernate.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.hibernate.dao.IPersonDao;
import com.test.hibernate.model.Person;

@Service
public class PersonBo implements IPersonBo {

	@Autowired
	IPersonDao personDao;

	@Override
	public void save(Person p) {
		// TODO Auto-generated method stub
		personDao.save(p);
	}

	@Override
	public List<Person> list() {
		// TODO Auto-generated method stub
		return personDao.list();
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return personDao.getPersonById(id);
	}

	@Override
	public boolean updatePerson(Person person) {
		// TODO Auto-generated method stub
		personDao.updatePerson(person);
		return true;
	}

	@Override
	public void deletePersonById(int id) {
		// TODO Auto-generated method stub
		personDao.deletePersonById(id);
	}

}
