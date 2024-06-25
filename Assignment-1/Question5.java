package com.assignment1;
import java.util.Scanner;
public class Question5 {
	static int a = 0;
	public static void sums(int first,int last) {
		for(int i=first;i<=last;i++) {
			a = a + i;
		}
		System.out.println("The sum of a number in given interval are:"+ a);
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of number :");
		int first=sc.nextInt();
		int last=sc.nextInt();
		sums(first,last);

	}

}
