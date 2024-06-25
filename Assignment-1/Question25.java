package com.assignment1;
import java.util.Scanner;
public class Question25 {
	public static int sum(int n) {
		int res=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)res+=i;
			else continue;
		}
	return res;
	}
	public static double friendly(int n) {
		double sum=sum(n);
		double res=0;
		res=sum/n;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		System.out.println("Enter another number: ");
		int b=sc.nextInt();
		double ratio1=friendly(a);
		double ratio2=friendly(b);
		if(ratio1==ratio2)System.out.println(a+" and "+b+" are friendly pairs.");
		else System.out.println(a+" and "+b+" are not friendly pairs.");
		sc.close();

	}

}
