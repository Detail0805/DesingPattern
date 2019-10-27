package com.atguigu.template.improve;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//製作紅豆豆漿
		
		System.out.println("----製作紅豆豆漿----");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		
		System.out.println("----製作花生豆漿----");
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
		
		System.out.println("----製作純豆漿----");
		SoyaMilk pureSoyaMilk = new PureSoyaMilk();
		pureSoyaMilk.make();
	}

}
