package com.atguigu.adapter.objectadapter;

//被適配的類
public class Voltage220V {
	//輸出220V的電壓，不變
	public int output220V() {
		int src = 220;
		System.out.println("電壓=" + src + "伏");
		return src;
	}
}
