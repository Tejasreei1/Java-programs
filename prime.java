package javaprogram;
import java.util.Scanner;


public class prime {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count=count+1;
			}
			
		}
		if(count==1) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
		

	}

}
