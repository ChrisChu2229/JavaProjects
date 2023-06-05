package Java_Lessons_About_Class;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(); // Create a new Student object

        student.setGradeYear("Senior");
        student.setStudentId("12345");
        student.setStudentName("John Doe");
        student.setStudentExtracurricular("Basketball");

        System.out.println("Name: " + student.getStudentName());
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Grade Year: " + student.getGradeYear());
        System.out.println("Extracurricular: " + student.getStudentExtracurricular());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter account holder name:");
        String accountHolderName = scanner.nextLine();

        System.out.println("Enter initial amount of money (0-1000):");
        double initialAmount = scanner.nextDouble();

        BankAccount bankAccount = null;
        if (initialAmount == 0.0) {
            bankAccount = new BankAccount(accountNumber, accountHolderName);
        } else {
            bankAccount = new BankAccount(accountNumber, accountHolderName, initialAmount);
        }

        boolean done = false;
        while (!done) {
            System.out.println("What would you like to do? (deposit, withdraw, check balance, quit)");
            String action = scanner.nextLine().toLowerCase();

            if (action.equals("deposit")) {
                System.out.println("Enter amount to deposit:");
                double depositAmount = scanner.nextDouble();
                scanner.nextLine(); // consume newline left-over
                bankAccount.deposit(depositAmount);
            } else if (action.equals("withdraw")) {
                System.out.println("Enter amount to withdraw:");
                double withdrawAmount = scanner.nextDouble();
                scanner.nextLine(); // consume newline left-over
                bankAccount.withdraw(withdrawAmount);
            } else if (action.equals("check balance")) {
                bankAccount.checkBalance();
            } else if (action.equals("quit")) {
                done = true;
            } else {
                System.out.println("Invalid command.");
            }
        }

        scanner.close();

    }

}
