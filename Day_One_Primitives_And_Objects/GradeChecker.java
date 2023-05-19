package Day_One_Primitives_And_Objects;

import java.util.Scanner;

public class GradeChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What grade did you get in the class: ");
        int grade = scan.nextInt();

        /* Incorrect if statements */
        if (grade >= 90) {
            System.out.println("You got an A in the class!");
        }
        if (grade >= 80) {
            System.out.println("You got a B in the class!");
        }
        if (grade >= 70) {
            System.out.println(("You got a C in the class."));
        }
        if (grade >= 60) {
            System.out.println("You got a D in the class.");
        }
        if (grade <= 59) {
            System.out.println("You have failed the class.");
        }

        /* Solution 1 using else if and else */
        if (grade >= 90) {
            System.out.println("You got an A in the class!");
        } else if (grade >= 80) {
            System.out.println("You got a B in the class!");
        } else if (grade >= 70) {
            System.out.println(("You got a C in the class."));
        } else if (grade >= 60) {
            System.out.println("You got a D in the class.");
        } else {
            System.out.println("You have failed the class.");
        }

        /* Solution 2 using && */
        if (grade >= 90) {
            System.out.println("You got an A in the class!");
        }
        if (grade >= 80 && grade <= 89) {
            System.out.println("You got a B in the class!");
        }
        if (grade >= 70 && grade <= 79) {
            System.out.println(("You got a C in the class."));
        }
        if (grade >= 60 && grade <= 69) {
            System.out.println("You got a D in the class.");
        }
        if (grade <= 59) {
            System.out.println("You have failed the class.");
        }
        scan.close();
    }

}
