package com.detail0805.template.improve;

//抽像類，表示豆漿
public abstract class SoyaMilk {

	//模板方法, make , 模板方法可以做成final , 不讓子類去覆蓋.
	final void make() {
		
		select(); 
		if(customerWantCondiments()) {
			addCondiments();
		}
		soak();
		beat();
		
	}
	
	//選材料
	void select() {
		System.out.println("第一步：選擇好的新鮮黃豆  ");
	}
	
	//新增不同的配料， 抽像方法, 子類具體實現
	abstract void addCondiments();
	
	//浸泡
	void soak() {
		System.out.println("第三步， 黃豆和配料開始浸泡， 需要3小時 ");
	}
	 
	void beat() {
		System.out.println("第四步：黃豆和配料放到豆漿機去打碎  ");
	}
	
	//鉤子方法，決定是否需要新增配料
	boolean customerWantCondiments() {
		return true;
	}
}
