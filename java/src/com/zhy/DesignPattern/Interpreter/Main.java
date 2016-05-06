package com.zhy.DesignPattern.Interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//½âÊÍÆ÷Ä£Ê½£¨Interpreter£©
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String expression = new BufferedReader(new InputStreamReader(System.in)).readLine();
        Calculator calculator = new Calculator(expression);
        double value = calculator.Calculate();
        System.out.println(value);
	}

}
