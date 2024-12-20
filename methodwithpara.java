package javaprogram;

public class methodwithpara {
    // Method to add two integers
    public int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static void main(String[] args) {
        int x = 12;
        int y = 12;

        // Creating an object of the class MethodWithPara (not add)
        methodwithpara myObj = new methodwithpara();

        // Calling the add method using the object
        int result = myObj.add(x, y);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}
