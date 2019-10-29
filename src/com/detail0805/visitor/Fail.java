package com.detail0805.visitor;

public class Fail extends Action {

	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println(" 男人給的評價該歌手失敗 !");
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println(" 女人給的評價該歌手失敗 !");
	}

}
