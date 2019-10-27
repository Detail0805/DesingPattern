package com.atguigu.visitor;

public class Success extends Action {

	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println(" 男人給的評價該歌手很成功 !");
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println(" 女人給的評價該歌手很成功 !");
	}

}
