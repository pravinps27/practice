package com.chainsys.day2;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter two number to perform arithmetic operation:");
		int num1=ps.nextInt();
		int num2=ps.nextInt();
		cal.a=num1;
		cal.b=num2;
		System.out.println("Addition of two number is:"+(num1+num2));
		System.out.println("Subraction of two number is:"+(num1-num2));
		System.out.println("Multiplication of two number is:"+(num1*num2));
		System.out.println("Division of two number is:"+(num1/num2));
		System.out.println("Percentage of two number is:"+(num1%num2));
		
	}

}
