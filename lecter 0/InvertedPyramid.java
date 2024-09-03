import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        // Print the inverted pyramid
        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}