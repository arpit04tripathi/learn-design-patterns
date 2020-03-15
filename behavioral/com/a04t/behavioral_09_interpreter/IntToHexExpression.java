package com.a04t.behavioral_09_interpreter;

public class IntToHexExpression implements Expression {
	private int i;

	public IntToHexExpression(int c) {
		this.i = c;
	}

	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getHexadecimalFormat(i);
	}
}