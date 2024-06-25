package com.assignment1;
import java.util.Scanner;
public class Question6 {
	public static int greatOfThree(int a,int b,int c) {
		return (a > b && a > c) ? a : (b > c) ? b : c;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int first=sc.nextInt();
		System.out.println("Enter the second number :");
		int second=sc.nextInt();
		System.out.println("Enter the second number :");
		int third=sc.nextInt();
		System.out.println("the greatest of three numbers are "+greatOfThree(first, second, third));

	}

}
