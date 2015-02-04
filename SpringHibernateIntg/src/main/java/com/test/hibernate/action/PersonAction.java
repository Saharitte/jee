package com.test.hibernate.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.test.hibernate.bo.IPersonBo;
import com.test.hibernate.model.Person;

public class PersonAction extends ActionSupport implements ModelDriven<Person> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Person person = new Person();
	List<Person> persons = new ArrayList<Person>();

	@Autowired
	IPersonBo personBo;

	@Override
	public Person getModel() {
		// TODO Auto-generated method stub
		return person;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public String addPerson() throws Exception {

		personBo.save(person);
		persons = null;
		persons = personBo.list();

		return "success";

	}

	public String deletePerson() throws Exception {

		personBo.deletePersonById(person.getId());
		persons = null;
		persons = personBo.list();

		return "success";

	}

	public String listPerson() throws Exception {
		persons = personBo.list();

		return "success";

	}

	public String editPerson() throws Exception {

		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		person = personBo.getPersonById(Integer.parseInt(request
				.getParameter("id")));
		return "success";

	}

}
