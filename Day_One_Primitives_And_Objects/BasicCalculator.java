package Day_One_Primitives_And_Objects;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output = 0.0;

        if (operator == '+') {
            output = num1 + num2;
        } else if (operator == '-') {
            output = num1 - num2;
        } else if (operator == '*') {
            output = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0.0) {
                output = num1 / num2;
            } else {
                System.out.println("Error! Dividing by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error! Invalid operator. Please enter correct operator.");
            return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }
}
