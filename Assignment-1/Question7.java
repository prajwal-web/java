package com.assignment1;
import java.util.Scanner;
public class Question7 {
	public static void leapYear(int year) {
		if(year%4==0) {
			if(year%100==0 ) {
				if(year%400==0) {
					System.out.println(year+" is a1 leap year");
				}else {
					System.out.println(year +" not a leap year");
				}
			}else {
				System.out.println(year + " is a leap year");
			}
         
		}else {
			System.out.println(year + " not a leap year");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year :");
		int year=sc.nextInt();
		leapYear(year);

	}

}
