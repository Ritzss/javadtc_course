public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {8,3,2,4,5,6};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the array is: " + sum);
    }
}