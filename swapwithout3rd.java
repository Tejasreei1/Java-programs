package javaprogram;

import java.util.Scanner;

public class swapwithout3rd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The first num: ");
		int num1 = sc.nextInt();
		
		System.out.println("The second num :");
		int num2 = sc.nextInt();
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("num1 = "+ num1 + " num2 = "+ num2 );
		
		
		
		// TODO Auto-generated method stub

	}

}
