package com.atguigu.adapter.classadapter;

//適配器類
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		//獲取到220V電壓
		int srcV = output220V();
		int dstV = srcV / 44 ; //轉成 5v
		return dstV;
	}

}
