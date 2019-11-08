package com.detail0805.prototype.deepclone;

import java.io.Serializable;

public class Testrec implements Serializable{

	
	public String name;
	
	public int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Testrec [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
