package com.atguigu.visitor;

public abstract class Action {
	
	//得到男性 的測評
	public abstract void getManResult(Man man);
	
	//得到女的 測評
	public abstract void getWomanResult(Woman woman);
}
