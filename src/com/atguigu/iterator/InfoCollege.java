package com.atguigu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

	List<Department> departmentList;
	
	
	public InfoCollege() {
		departmentList = new ArrayList<Department>();
		addDepartment("資訊保安專業", " 資訊保安專業 ");
		addDepartment("網路安全專業", " 網路安全專業 ");
		addDepartment("伺服器安全專業", " 伺服器安全專業 ");
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "資訊工程學院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		// TODO Auto-generated method stub
		Department department = new Department(name, desc);
		departmentList.add(department);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new InfoColleageIterator(departmentList);
	}

}
