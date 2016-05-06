package com.zhy.DesignPattern.Interpreter;

import java.util.HashMap;

public class Context {

	private HashMap<Character, Double> variable;

	public HashMap<Character, Double> getVariable() {
		if(variable==null)
		{
			variable = new HashMap<Character, Double>();
		}
		return variable;
	}

	public void setVariable(HashMap<Character, Double> variable) {
		this.variable = variable;
	}
}
