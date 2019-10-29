package com.detail0805.interpreter;

import java.util.HashMap;


/**
 * 變數的直譯器
 * @author Administrator
 *
 */
public class VarExpression extends Expression {

	private String key; // key=a,key=b,key=c

	public VarExpression(String key) {
		this.key = key;
	}

	// var 就是{a=10, b=20}
	// interpreter 根據 變數名稱，返回對應值
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
