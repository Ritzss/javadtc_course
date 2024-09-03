public class TableOfFive {
    public static void main(String[] args) {
        // Declare an array to store the table of 5
        int[] table = new int[30];

        // Calculate and store the table of 5 in the array
        for (int i = 0; i < 10; i++) {
            table[i] = 5 * (i+1);
        }

        // Print the table of 5
        System.out.println("Table of 5:");
        for (int i = 0; i < 10; i++) {
            System.out.println(table[i]);
        }
    }
}