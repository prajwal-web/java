package com.assignment1;
import java.util.Scanner;
public class Question18 {
	public static double powerIterative(double base, int exponent) {
        double result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the base: ");
	        double base = sc.nextDouble();
	        System.out.print("Enter the exponent: ");
	        int exponent = sc.nextInt();
	        sc.close();
	        
	        double result = powerIterative(base, exponent);
	        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
	}

}
