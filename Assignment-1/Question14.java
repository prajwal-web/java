package com.assignment1;
import java.util.Scanner;
public class Question14 {
	public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void findArmstrongNumbersInRange(int start, int end) {
        System.out.println("Armstrong numbers in the range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the start of the range: ");
	        int start = sc.nextInt();
	        System.out.print("Enter the end of the range: ");
	        int end = sc.nextInt();
	        sc.close();

	        findArmstrongNumbersInRange(start, end);

	}

}
