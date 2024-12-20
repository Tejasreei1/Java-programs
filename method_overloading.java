package javaprogram;

public class method_overloading {

	public int sum(int a,int b ) {
		return(a+b);
	}
	public int sum(int a,int b,int c) {
		return(a+b+c);
	}
	public double sum(double a,double b) {
		return(a+b);
	}


public static void main(String[]args) {
	method_overloading s1=new method_overloading();
	
	System.out.println(s1.sum(45,89));
	System.out.println(s1.sum(67,19,80));
	System.out.println(s1.sum(12.75,8.95));

}

}



