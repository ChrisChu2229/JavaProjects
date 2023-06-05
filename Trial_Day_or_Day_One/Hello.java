package Trial_Day_or_Day_One;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello world");

        // Primitive data types (except String)
        String myName = "Chris";
        int myAge = 23;
        double myHeight = 5.3;
        boolean isSunny = true;
        char letter = 't';

        System.out.println("My name is: " + myName);
        System.out.print("My age: ");
        System.out.println(myAge);

        // Operators
        int mySum = 5 + 13;
        int myDiff = 27 - 4;
        int myProd = 3 * 4;
        int myQuo = 50 / 10;
        int myMod = 45 % 10;

        System.out.println(mySum);
        System.out.println(myProd);
        System.out.println(myMod);

        String test = "test";
        String test2 = new String("test");

        System.out.println(test.equals(test2));

        /* diamond pattern */

        for (int i = 1; i <= 5; i++) {

            for (int k = 5; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int ii = 4; ii > 0; ii--) {

            for (int kk = 4; kk >= ii; kk--) {
                System.out.print(" ");
            }

            for (int jj = 0; jj < (ii * 2) - 1; jj++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
