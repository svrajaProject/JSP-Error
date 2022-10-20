package com.gl.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.crm.DAO.CustomerDAO;
import com.gl.crm.model.Customer;

@Controller
@RequestMapping("/customer")
public class HomeController {

	@Autowired
	CustomerDAO customerDao;
	
	@RequestMapping("/list")
	public String show(Model model) {
		List<Customer> customers = customerDao.findAll();
		model.addAttribute("customers", customers);
		return "customer-list";
	}
}
