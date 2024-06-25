package com.assignment1;
import java.util.Scanner;
public class Question11 {
    public static int reverse(int n,int rev) {
    	if(n==0) {
    		return rev;
    	}
    	rev*=10;
    	rev+=n%10;
    	return reverse(n/10,rev);
    }
	public static void main(String[] args) {
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("the reverse of a number "+ a + " is " + reverse(a,rev));

	}

}
