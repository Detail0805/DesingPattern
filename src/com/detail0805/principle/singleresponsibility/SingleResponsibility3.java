package com.detail0805.principle.singleresponsibility;

public class SingleResponsibility3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 vehicle2  = new Vehicle2();
		vehicle2.run("汽車");
		vehicle2.runWater("輪船");
		vehicle2.runAir("飛機");
	}

}


//方式3的分析
//1. 這種修改方法沒有對原來的類做大的修改，只是增加方法
//2. 這裡雖然沒有在類這個級別上遵守單一職責原則，但是在方法級別上，仍然是遵守單一職責
class Vehicle2 {
	public void run(String vehicle) {
		//處理
		
		System.out.println(vehicle + " 在公路上執行....");
		
	}
	
	public void runAir(String vehicle) {
		System.out.println(vehicle + " 在天空上執行....");
	}
	
	public void runWater(String vehicle) {
		System.out.println(vehicle + " 在水中行....");
	}
	
	//方法2.
	//..
	//..
	
	//...
}
