package com.gl.crm.DAO;

import java.util.List;

import com.gl.crm.model.Customer;

public interface CustomerDAO {


	public void save(Customer customer);
	public void saveOrUpdate(Customer customer);
	public void update(Customer customer);
	public void delete(Customer customer);
	public Customer findbyId(int id);
	public List<Customer>findAll();
}
