package com.atguigu.interpreter;

import java.util.HashMap;

/**
 * 抽像運算子號解析器 這裡，每個運算子號，都只和自己左右兩個數字有關係，
 * 但左右兩個數字有可能也是一個解析的結果，無論何種型別，都是Expression類的實現類
 * 
 * @author Administrator
 *
 */
public class SymbolExpression extends Expression {

	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//因為 SymbolExpression 是讓其子類來實現，因此 interpreter 是一個預設實現
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
}
