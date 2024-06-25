package com.assignment1;
import java.util.Scanner;
public class Question2 {
	public static void oddEven(int n) {
		if(n%2==0)System.out.println(n +":is a even number");
		else System.out.println(n +":is a odd number");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		oddEven(n);
	}

}
