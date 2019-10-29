package com.detail0805.visitor;

//說明
//1. 這裡我們使用到了雙分派, 即首先在客戶端程式中，將具體狀態作為參數傳遞Woman中(第一次分派)
//2. 然後Woman 類呼叫作為參數的 "具體方法" 中方法getWomanResult, 同時將自己(this)作為參數
//   傳入，完成第二次的分派
public class Woman extends Person{

	@Override
	public void accept(Action action) {
		// TODO Auto-generated method stub
		action.getWomanResult(this);
	}

}
