package palindromeSamples;

import java.util.Scanner;

public class PalinString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Word to Check Whether it is Palindrome or not!");
		String s=sc.nextLine();
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse= reverse + s.charAt(i);
		}
		if(s.equals(reverse)) {
			System.out.println("You have entered " +s+ " is a Palindrome!" );
		}
		else {
			System.out.println("You have entered " +s+ " is not a Palindrome!");
		}
	}

}
