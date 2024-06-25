package com.assignment1;
import java.util.Scanner;
public class Question1 {
	public static void checkNum(int n) {
		if(n>=0)System.out.println("Positive Number");
		else System.out.println("Negative Number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		checkNum(n);

		
	}
}
