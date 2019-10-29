package com.detail0805.interpreter;

import java.util.HashMap;

/**
 * 抽像類表達式，通過HashMap 鍵值對, 可以獲取到變數的值
 * 
 * @author Administrator
 *
 */
public abstract class Expression {
	// a + b - c
	// 解釋公式和數值, key 就是公式(表達式) 參數[a,b,c], value就是就是具體值
	// HashMap {a=10, b=20}
	public abstract int interpreter(HashMap<String, Integer> var);
}
