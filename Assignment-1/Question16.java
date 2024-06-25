package com.assignment1;
import java.util.Scanner;
public class Question16 {
	public static int fib(int n) {
		int sum=0;
		int a=0;
		int b=1;
		for(int i=0;i<n-2;i++) {
			//System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			
		}return sum;
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int n=sc.nextInt();
		int sum=fib(n);
		System.out.println(sum);
		sc.close();

	}

}
