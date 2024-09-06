public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int[] swapped = swapn(a, b);
        a = swapped[0];
        b = swapped[1];
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public static int[] swapn(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}