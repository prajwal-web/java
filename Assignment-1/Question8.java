package com.assignment1;
import java.util.*;

public class Question8 {
	public static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		if(isPrime(n))System.out.println(n+" is a prime number");
		else System.out.println(n+" is not a prime number");
		
	}

}

