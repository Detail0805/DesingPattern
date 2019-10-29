package com.detail0805.interpreter;

import java.util.HashMap;

/**
 * 加法直譯器
 * @author Administrator
 *
 */
public class AddExpression extends SymbolExpression  {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	//處理相加
	//var 仍然是 {a=10,b=20}..
	//一會我們debug 原始碼,就ok
	public int interpreter(HashMap<String, Integer> var) {
		//super.left.interpreter(var) ： 返回 left 表達式對應的值 a = 10
		//super.right.interpreter(var): 返回right 表達式對應值 b = 20
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}
