package com.detail0805.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

	Department[] departments;
	int numOfDepartment = 0 ;// 儲存目前陣列的對象個數
	
	
	public ComputerCollege() {
		departments = new Department[5];
		addDepartment("Java專業", " Java專業 ");
		addDepartment("PHP專業", " PHP專業 ");
		addDepartment("大數據專業", " 大數據專業 ");
		
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "計算機學院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		// TODO Auto-generated method stub
		Department department = new Department(name, desc);
		departments[numOfDepartment] = department;
		numOfDepartment += 1;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ComputerCollegeIterator(departments);
	}

}
