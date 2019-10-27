package com.atguigu.memento.theory;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	//在List 集合中會有很多的備忘錄對像
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	//獲取到第index個Originator 的 備忘錄對像(即儲存狀態)
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
