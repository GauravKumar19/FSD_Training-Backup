package com.coforge.training.assignment.dao;

import java.util.List;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.training.assignment.model.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveEmp(Employee theemployee) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theemployee);

	}

	@Override
	public List<Employee> getemployee() {
		Session session = sessionFactory.getCurrentSession();
		//jpa queries -jpql
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class); // roots references entity
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList(); // fetch all records from Customer class using getters
	}

	@Override
	public Employee getEmp(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();

		Employee theemployee =currentSession.get(Employee.class,theId);

		return theemployee;
	}

	@Override
	public void deleteEmp(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();

		Employee emp =currentSession.byId(Employee.class).load(theId);

		currentSession.delete(emp);

	}


}
