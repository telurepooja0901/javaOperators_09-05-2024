package com.javaTernaryOperator;

public class TernaryOperator

{
	public static void main(String[] args)
	{

		int a = 36, b = 67, c = 29, d = 54;
		
		int result1 = (a < d ? (a < b ? (a < c ? a : c) : (b < c ? b : c)) : (b < c ? (b < d ? b : d) : (c < d ? c : d)));
		
		System.out.println(result1);
		
	}

}
