package com.assignment1;
import java.util.Scanner;
public class Question17 {
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("the Factorial of "+ a + " is "+ factorial(a));
	}

}
