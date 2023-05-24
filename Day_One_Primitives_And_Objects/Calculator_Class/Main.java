package Day_One_Primitives_And_Objects.Calculator_Class;

public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        int sum = myCalculator.add(10, 20);
        int difference = myCalculator.subtract(20, 10);
        int product = myCalculator.multiply(10, 20);
        double quotient = myCalculator.divide(20, 10);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
