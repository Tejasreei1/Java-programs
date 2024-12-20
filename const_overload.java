package javaprogram;

class Rectangle {
    int length;
    int width;

    
    Rectangle() {
        length = 0;
        width = 0;
    }

    
    Rectangle(int side) {
        length = side;
        width = side; 
    }

    
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    
    int area() {
        return length * width;
    }
}

public class const_overload { 
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();           
        Rectangle rect2 = new Rectangle(5);          
        Rectangle rect3 = new Rectangle(10, 20);     

        System.out.println("Area of rect1: " + rect1.area()); 
        System.out.println("Area of rect2: " + rect2.area());
        System.out.println("Area of rect3: " + rect3.area()); 
    }
}
