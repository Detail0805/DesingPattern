package com.detail0805.proxy.staticproxy;

//代理對像,靜態代理
public class TeacherDaoProxy implements ITeacherDao{
	
	private ITeacherDao target; // 目標對象，通過介面來聚合
	
	
	//構造器
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}



	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("開始代理  完成某些操作。。。。。 ");//方法
		target.teach();
		System.out.println("提交。。。。。");//方法
	}

}
