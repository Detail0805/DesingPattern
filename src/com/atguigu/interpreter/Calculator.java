package com.atguigu.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

	// 定義表達式
	private Expression expression;

	// 建構函式傳參，並解析
	public Calculator(String expStr) { // expStr = a+b
		// 安排運算先後順序
		Stack<Expression> stack = new Stack<Expression>();
		// 表達式拆分成字元陣列 
		char[] charArray = expStr.toCharArray();// [a, +, b]

		Expression left = null;
		Expression right = null;
		//遍歷我們的字元陣列， 即遍歷  [a, +, b]
		//針對不同的情況，做處理
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+': //
				left = stack.pop();// 從stack取出left => "a"
				right = new VarExpression(String.valueOf(charArray[++i]));// 取出右表達式 "b"
				stack.push(new AddExpression(left, right));// 然後根據得到left 和 right 構建 AddExpresson加入stack
				break;
			case '-': // 
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default: 
				//如果是一個 Var 就建立要給 VarExpression 對象，並push到 stack
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		//當遍歷完整個 charArray 陣列后，stack 就得到最後Expression
		this.expression = stack.pop();
	}

	public int run(HashMap<String, Integer> var) {
		//最後將表達式a+b和 var = {a=10,b=20}
		//然後傳遞給expression的interpreter進行解釋執行
		return this.expression.interpreter(var);
	}
}