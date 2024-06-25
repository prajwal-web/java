package com.assignment1;

public class Question3 {
	public static int sumOfNatural1(int n) {
		if(n==0) {
			return 0;
		}
		return n + sumOfNatural1(n-1);
	}
	
	
	
	static int a = 0;
	public static void sumOfNatural2(int n) {
		for(int i=1;i<=n;i++) {
			a = a + i;
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println(sumOfNatural1(10));
		sumOfNatural2(10);
	}

}
