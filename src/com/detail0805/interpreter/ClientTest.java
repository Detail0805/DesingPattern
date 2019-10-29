package com.detail0805.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ClientTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String expStr = getExpStr(); // a+b
		HashMap<String, Integer> var = getValue(expStr);// var {a=10, b=20}
		Calculator calculator = new Calculator(expStr);
		System.out.println("運算結果：" + expStr + "=" + calculator.run(var));
	}

	// 獲得表達式
	public static String getExpStr() throws IOException {
		System.out.print("請輸入表達式：");
		return (new BufferedReader(new InputStreamReader(System.in))).readLine();
	}

	// 獲得值對映
	public static HashMap<String, Integer> getValue(String expStr) throws IOException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (char ch : expStr.toCharArray()) {
			if (ch != '+' && ch != '-') {
				if (!map.containsKey(String.valueOf(ch))) {
					System.out.print("請輸入" + String.valueOf(ch) + "的值：");
					String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					map.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}

		return map;
	}
}
