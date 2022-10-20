package com.gl.crm.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gl.crm.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	SessionFactory factory;
	
	@Override
	@Transactional
	public void save(Customer customer) {
		Session currentSession = factory.getCurrentSession();
		currentSession.saveOrUpdate(customer);
	}

	@Override
	public void saveOrUpdate(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer findbyId(int id) {
		Session currentSession = factory.getCurrentSession();
		Customer theCustomer = currentSession.get(Customer.class,id); 
		return theCustomer;
	}

	@SuppressWarnings("deprecation")
	@Override
	@Transactional
	public List<Customer> findAll() {
		Session currentSession = factory.getCurrentSession();
		Criteria c = currentSession.createCriteria(Customer.class);
		return c.list();
	}

}
