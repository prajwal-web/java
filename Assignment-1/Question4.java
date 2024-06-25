package com.assignment1;
import java.util.Scanner;


public class Question4 {
	public static int greatest(int a,int b) {
		return a>b?a:b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter Second number");
		int b = sc.nextInt();
		System.out.println("greates of 2 numbers are:"+greatest(a,b));
		
	}

}
