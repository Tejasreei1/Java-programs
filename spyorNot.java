package javaprograms;

import java.util.Scanner;

public class spyorNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();


		int sum = 0, mul = 1;
		int r;


		int temp = num;

		while (num>0) {
			r=num%10;
			sum=sum+r;
			mul=mul*r;
			num=num/10;

		}

		if (sum == mul) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
