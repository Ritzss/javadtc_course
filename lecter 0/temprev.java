public class temprev {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        printArray(originalArray);

        int[] reversedArray = reverseArray(originalArray);
        System.out.println("Reversed Array: ");
        printArray(reversedArray);
    }

    public static int[] reverseArray(int[] originalArray) {
        int[] tempArray = new int[originalArray.length];
        int j = 0;
        for (int i = originalArray.length - 1; i >= 0; i--) {
            tempArray[j] = originalArray[i];
            j++;
        }
        return tempArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}