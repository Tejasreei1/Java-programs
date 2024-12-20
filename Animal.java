package javaprogram;

class Animal1 {
	
	void move() {
		System.out.println("I am moving");
	}
}


class Cheetah extends Animal1 {

	void move() {
		System.out.println("I am running");
	}
}
public class Animal{



	public static void main(String[] args) {

		Cheetah myCheetah = new Cheetah();


		myCheetah.move();  
	}
}
