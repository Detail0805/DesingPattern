package com.atguigu.visitor;

import java.util.LinkedList;
import java.util.List;

//數據結構，管理很多人（Man , Woman）
public class ObjectStructure {

	//維護了一個集合
	private List<Person> persons = new LinkedList<Person>();
	
	//增加到list
	public void attach(Person p) {
		persons.add(p);
	}
	//移除
	public void detach(Person p) {
		persons.remove(p);
	}
	
	//顯示測評情況
	public void display(Action action) {
		for(Person p: persons) {
			p.accept(action);
		}
	}
}
