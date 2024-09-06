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
    public static void main(String[] args) {
        System.out.println("The sum of the array is: " + sarray() );
    }
}