package com.detail0805.principle.inversion.improve;

public class DependecyInversion {

	public static void main(String[] args) {
		//客戶端無需改變
		Person person = new Person();
		person.receive(new Email());
		
		person.receive(new WeiXin());
	}

}

//定義介面
interface IReceiver {
	public String getInfo();
}

class Email implements IReceiver {
	public String getInfo() {
		return "電子郵件資訊: hello,world";
	}
}

//增加微信
class WeiXin implements IReceiver {
	public String getInfo() {
		return "微信資訊: hello,ok";
	}
}

//方式2
class Person {
	//這裡我們是對介面的依賴
	public void receive(IReceiver receiver ) {
		System.out.println(receiver.getInfo());
	}
}
