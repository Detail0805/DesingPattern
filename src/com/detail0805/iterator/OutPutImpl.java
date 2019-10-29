package com.detail0805.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
	
	//學院集合
	List<College> collegeList;

	public OutPutImpl(List<College> collegeList) {
		
		this.collegeList = collegeList;
	}
	//遍歷所有學院,然後呼叫printDepartment 輸出各個學院的系
	public void printCollege() {
		
		//從collegeList 取出所有學院, Java 中的 List 已經實現Iterator
		Iterator<College> iterator = collegeList.iterator();
		
		while(iterator.hasNext()) {
			//取出一個學院
			College college = iterator.next();
			System.out.println("=== "+college.getName() +"=====" );
			printDepartment(college.createIterator()); //得到對應迭代器
		}
	}
	
	
	//輸出 學院輸出 系
	
	public void printDepartment(Iterator iterator) {
		while(iterator.hasNext()) {
			Department d = (Department)iterator.next();
			System.out.println(d.getName());
		}
	}
	
}
