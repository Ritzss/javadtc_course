public class all  {
    public static void main(String[] args) {
        // Initialize an array
        int[] array = {1, 2, 3, 4, 5};

        // Initialize sum variable
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < i + 1; j++) {
                sum += array[j];
            }
        }

        // Print the sum
        System.out.println("The sum of the array is: " + sum);
    }
}