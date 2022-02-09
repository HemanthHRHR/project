package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginDao;
import com.example.demo.dao.MyDao;
import com.example.demo.model.Employee;
import com.example.demo.model.Register;

@Service
public class MyService {
	@Autowired
	MyDao myDao;
	
	@Autowired
	LoginDao loginDao;

	public Register reg(Register register) {
		Register save = myDao.save(register);
		return save;
	}

	public Employee addemp(Employee employee) {
		Employee emp=loginDao.save(employee);
		return emp;
	}

	public Iterable<Register> getall() {
        return myDao.findAll();		
	}

	public Employee editemp(Employee employee) {
		return loginDao.save(employee);
	}

	public void removeemp(String name,Employee employee) {
        loginDao.delete(employee);
	}

}
