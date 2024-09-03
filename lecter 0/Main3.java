import java.util.Scanner;

public class Main3 {
    public static void printPattern(int rows, int cols) {
        // Print top border
        for (int i = 1; i <= cols; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Print middle rows
        for (int i = 2; i <= rows; i++) {
            System.out.print("* ");
            for (int j = 2; j < cols; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }

        // Print bottom border
        for (int i = 1; i <= cols; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        printPattern(rows, cols);
    }
}