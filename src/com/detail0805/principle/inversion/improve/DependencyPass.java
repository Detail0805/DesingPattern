package com.detail0805.principle.inversion.improve;

public class DependencyPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangHong changHong = new ChangHong();
//		OpenAndClose openAndClose = new OpenAndClose();
//		openAndClose.open(changHong);
		
		//通過構造器進行依賴傳遞
//		OpenAndClose openAndClose = new OpenAndClose(changHong);
//		openAndClose.open();
		//通過setter方法進行依賴傳遞
		OpenAndClose openAndClose = new OpenAndClose();
		openAndClose.setTv(changHong);
		openAndClose.open();

	}

}

// 方式1： 通過介面傳遞實現依賴
// 開關的介面
// interface IOpenAndClose {
// public void open(ITV tv); //抽像方法,接收介面
// }
//
// interface ITV { //ITV介面
// public void play();
// }
// 
// class ChangHong implements ITV {
//
//	@Override
//	public void play() {
//		// TODO Auto-generated method stub
//		System.out.println("長虹電視機，打開");
//	}
//	 
// }
//// 實現介面
// class OpenAndClose implements IOpenAndClose{
// public void open(ITV tv){
// tv.play();
// }
// }

// 方式2: 通過構造方法依賴傳遞
// interface IOpenAndClose {
// public void open(); //抽像方法
// }
// interface ITV { //ITV介面
// public void play();
// }
// class OpenAndClose implements IOpenAndClose{
// public ITV tv; //成員
// public OpenAndClose(ITV tv){ //構造器
// this.tv = tv;
// }
// public void open(){
// this.tv.play();
// }
// }


// 方式3 , 通過setter方法傳遞
interface IOpenAndClose {
	public void open(); // 抽像方法

	public void setTv(ITV tv);
}

interface ITV { // ITV介面
	public void play();
}

class OpenAndClose implements IOpenAndClose {
	private ITV tv;

	public void setTv(ITV tv) {
		this.tv = tv;
	}

	public void open() {
		this.tv.play();
	}
}

class ChangHong implements ITV {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("長虹電視機，打開");
	}
	 
}