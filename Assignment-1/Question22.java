package com.assignment1;
import java.util.Scanner;
public class Question22 {
	public static boolean isPerfectSquare(int n) {
		for(int i=1;i<=n/2;i++) {
			if(i*i==n)return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if(isPerfectSquare(n))System.out.println(n+" is a perfect square");
		else System.out.println(n+" is not a perfect square");

	}

}
