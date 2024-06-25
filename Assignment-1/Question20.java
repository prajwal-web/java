package com.assignment1;
import java.util.Scanner;
public class Question20 {
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
	
		return fact;
	}
		public static int strong(int n) {
			int res=0;
			int sum=0;
			while(n>0) {
				res=n%10;
				sum=sum+fact(res);
				n=n/10;
			}
			return sum;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		int n=sc.nextInt();
		int sum=strong(n);
		if(n==sum)System.out.println(sum+" is a Strong number.");
		else System.out.println(sum+" is not a strong number.");
		sc.close();

	}

}
