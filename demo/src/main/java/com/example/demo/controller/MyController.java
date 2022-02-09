package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.Register;
import com.example.demo.service.MyService;

@RestController
@RequestMapping("/api/p1")
public class MyController {

	@Autowired
	MyService myService;

	@PostMapping("/register")
	public ResponseEntity<Register> register(@RequestBody Register register) {
		Register reg = myService.reg(register);
		return new ResponseEntity<Register>(reg, HttpStatus.OK);
	}

	@GetMapping("/login")
	public ResponseEntity<Iterable<Register>> login() {
		Iterable<Register> getall = myService.getall();
		return new ResponseEntity<Iterable<Register>>(getall, HttpStatus.OK);
	}

	@PostMapping("/addemp")
	public ResponseEntity<Employee> employee(@RequestBody Employee employee) {
		Employee emp = myService.addemp(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}

	@PutMapping("/edit")
	public ResponseEntity<Employee> editemployee(@RequestBody Employee employee) {
		Employee editemp = myService.editemp(employee);
		return new ResponseEntity<Employee>(editemp, HttpStatus.OK);

	}
	
	@DeleteMapping("/delete")
	public void deleteemp(@RequestParam String name, Employee employee){
//		String name = employee.getName();
		myService.removeemp(name,employee);
	}
	
}
