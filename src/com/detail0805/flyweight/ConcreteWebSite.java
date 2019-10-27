package com.atguigu.flyweight;

//具體網站
public class ConcreteWebSite extends WebSite {

	//共享的部分，內部狀態
	private String type = ""; //網站發佈的形式(型別)

	
	//構造器
	public ConcreteWebSite(String type) {
		
		this.type = type;
	}


	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("網站的發佈形式為:" + type + " 在使用中 .. 使用者是" + user.getName());
	}
	
	
}
