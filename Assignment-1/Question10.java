package com.assignment1;

import java.util.Scanner;

public class Question10 {
	public static int sumDigits(int number) {
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			number = number/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int sum = sumDigits(number);
		System.out.println("The sum of the digits is: " + sum);

	}

}
