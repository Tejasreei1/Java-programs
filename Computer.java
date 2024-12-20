package javaprogram;

class Computer {
    class Processor {
        String brand = "Intel";
        double speed = 3.6;  // in GHz

        public void displayDetails() {
            System.out.println("Processor Brand: " + brand);
            System.out.println("Processor Speed: " + speed + " GHz");
        }
    }



    public static void main(String[] args) {
        Computer myComputer = new Computer();
        Computer.Processor myProcessor = myComputer.new Processor();
        myProcessor.displayDetails();  // Output: Processor Brand: Intel, Processor Speed: 3.6 GHz
    }
}