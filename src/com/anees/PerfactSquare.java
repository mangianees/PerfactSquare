package com.anees;

import java.util.Scanner;

public class PerfactSquare {

	public static void main(String[] args) {
		double num;
		double sqrt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check");
		num = sc.nextDouble();
		sqrt = Math.sqrt(num);
		if(sqrt - Math.floor(sqrt)==0)
			System.out.println(num + " => True");
		else
			System.out.println(num + " => False");
		
		

	}

}
