package main;

import employee.Employee;
import manager.Manager;

public class main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Employee employee = new Employee();
		System.out.println(manager.calsal(15000));
		System.out.println(manager.calsal(15000,1500,140));
		System.out.println(employee.calsal(15000,150));
		
	}

}
