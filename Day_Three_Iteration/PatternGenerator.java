package Day_Three_Iteration;

public class PatternGenerator {

    public static void main(String[] args) {
        int rows = 5;

        // Triangle Generator //
        for (int i = 0; i < rows; i++) {

            /* normal triangle */
            // for (int k = rows; k > i + 1; k--) {
            // System.out.print(" ");
            // }

            /* reverse triangle */
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Diamond Generator //
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
