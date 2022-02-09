package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

 @Data
 @Entity
 public class Employee {
	@Id
//	private Integer id;
	private String name;
	private int age;
	private String job;
	private double salary;

 }
