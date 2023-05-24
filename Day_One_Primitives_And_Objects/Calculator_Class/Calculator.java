package Day_One_Primitives_And_Objects.Calculator_Class;

public class Calculator {

    // Constructor
    public Calculator() {
    }

    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error! Dividing by zero is not allowed.");
            return -1;
        }
    }
}
