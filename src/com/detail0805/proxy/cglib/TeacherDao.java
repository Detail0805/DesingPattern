package com.detail0805.proxy.cglib;

public class TeacherDao {

	public String teach() {
		System.out.println(" 老師授課中  ， 我是cglib代理，不需要實現介面 ");
		return "hello";
	}
}
