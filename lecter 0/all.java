public class all  {
    public static int sarray( ) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < i + 1; j++) {
                sum += array[j];
            }
        }
        return sum;
    }

    public static void ReverseArray () {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println("Original array: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            int[] reversedArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                reversedArr[i] = arr[arr.length - i - 1];
            }
            System.out.println("Reversed array: ");
            for (int i : reversedArr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        System.out.println("The sum of the array is: " + sarray() );
        ReverseArray();
    }
}
