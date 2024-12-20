package javaprograms;
import java.util.Scanner;

public class numequal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter first num2: ");
		int num2=sc.nextInt();
		System.out.println("Enter first num3: ");
		int num3=sc.nextInt();
		
		if(num1==num2 && num1==num3) {
			System.out.println("Numbers are equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		
	}

}
