package com.detail0805.principle.segregation;

public class Segregation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//介面
interface Interface1 {
	void operation1();
	void operation2();
	void operation3();
	void operation4();
	void operation5();
}

class B implements Interface1 {
	public void operation1() {
		System.out.println("B 實現了 operation1");
	}
	
	public void operation2() {
		System.out.println("B 實現了 operation2");
	}
	public void operation3() {
		System.out.println("B 實現了 operation3");
	}
	public void operation4() {
		System.out.println("B 實現了 operation4");
	}
	public void operation5() {
		System.out.println("B 實現了 operation5");
	}
}

class D implements Interface1 {
	public void operation1() {
		System.out.println("D 實現了 operation1");
	}
	
	public void operation2() {
		System.out.println("D 實現了 operation2");
	}
	public void operation3() {
		System.out.println("D 實現了 operation3");
	}
	public void operation4() {
		System.out.println("D 實現了 operation4");
	}
	public void operation5() {
		System.out.println("D 實現了 operation5");
	}
}

class A { //A 類通過介面Interface1 依賴(使用) B類，但是隻會用到1,2,3方法
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend2(Interface1 i) {
		i.operation2();
	}
	public void depend3(Interface1 i) {
		i.operation3();
	}
}
  
class C { //C 類通過介面Interface1 依賴(使用) D類，但是隻會用到1,4,5方法
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend4(Interface1 i) {
		i.operation4();
	}
	public void depend5(Interface1 i) {
		i.operation5();
	}
}