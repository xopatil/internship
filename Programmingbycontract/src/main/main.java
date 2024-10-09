package main;

import employee.employee;
import manager.manager;

public class main {
	public static void main(String[] args) {
		manager manager = new manager();
		employee employee = new employee();
		System.out.println(manager.calsal(15000));
		System.out.println(manager.calsal(15000,1500,140));
		System.out.println(employee.calsal(15000,150));
		
	}

}
