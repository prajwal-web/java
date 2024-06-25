package com.assignment1;
import java.util.Scanner;
public class Question24 {
	public static int sum(int n) {
		int res=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)res+=i;
			else continue;
		}
	return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		int n=sc.nextInt();
		int res=sum(n);
		if(res>n)System.out.println(n+" is a Abundant number.");
		else System.out.println(n+" is not a Abundant number.");
		sc.close();

	}

}
