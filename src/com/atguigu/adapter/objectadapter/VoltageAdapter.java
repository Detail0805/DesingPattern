package com.atguigu.adapter.objectadapter;

//適配器類
public class VoltageAdapter  implements IVoltage5V {

	private Voltage220V voltage220V; // 關聯關係-聚合
	
	
	//通過構造器，傳入一個 Voltage220V 實例
	public VoltageAdapter(Voltage220V voltage220v) {
		
		this.voltage220V = voltage220v;
	}



	@Override
	public int output5V() {
		
		int dst = 0;
		if(null != voltage220V) {
			int src = voltage220V.output220V();//獲取220V 電壓
			System.out.println("使用對像適配器，進行適配~~");
			dst = src / 44;
			System.out.println("適配完成，輸出的電壓為=" + dst);
		}
		
		return dst;
		
	}

}
