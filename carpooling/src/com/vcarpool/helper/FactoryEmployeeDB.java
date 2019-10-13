package com.vcarpool.helper;

import com.vcarpool.dao.EmployeeDAOImpl;
import com.vcarpool.dao.EmployeesDAO;

import com.vcarpool.service.EmployeeService;
import com.vcarpool.service.EmployeeServiceImpl;
//import com.vcarpool.service.LoginService;
//import com.vcarpool.service.LoginServiceImpl;

public class FactoryEmployeeDB {

	public static EmployeesDAO createEmployeesDAO(){
		EmployeesDAO employeesDAO=new EmployeeDAOImpl();
 		return employeesDAO;
		
	}
	public static EmployeeService createEmployeesService(){
		EmployeeService employeesService=
				new EmployeeServiceImpl();
		return employeesService;
	}
	
}
