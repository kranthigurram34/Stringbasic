package palindromeSamples;

import java.util.Scanner;

public class PalinInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Number to Check Whether it is Palindrome or not!");
		int input=sc.nextInt();
		int given=input;
		int reverse=0;
		int number;
		while(given>0) {
			number=given%10;
			given=given/10;
			reverse=reverse*10+number;
		}
		if(reverse==input) {
			System.out.println("You have entered " +input+ " is a Palindrome");
		}
		else {
			System.out.println("You have entered " +input+ " is not a Palindrome");
		}
	}
}