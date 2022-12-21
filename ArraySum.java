import java.util.*;
//Khiem Do

public class ArraySum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int x = 10;
        final int y = 5;
        int[] inputs = new int[x];
        int[] array1 = new int[y];
        int[] array2 = new int[y];
        int[] sum;

        System.out.println("Enter ten values, separated by spaces ");
        System.out.println("We will add two arrays at their indexes: ");

        for (int i = 0; i < x; i++) {
            if (scnr.hasNextInt()) { // inputs Array
                inputs[i] = scnr.nextInt();
            }
        }

        for (int i = 0; i < y; i++) {
            array1[i] = inputs[i]; // Array 1
        }

        for (int i = 0; i < y; i++) {
            array2[i] = inputs[i + 5]; // Array 2
        }

        sum = add(array1, array2);

        System.out.println("\n" + "Array 1 : " + Arrays.toString(array1));
        System.out.println("Array 2 : " + Arrays.toString(array2));
        System.out.println("The sum are : " + Arrays.toString(sum));
    }

    public static int[] add(int[] x, int[] y) { // method 2
        int[] sum = new int[5];

        for (int i = 0; i < 5; i++) {
            sum[i] = x[i] + y[i]; // sum of two arrays
        }
        return sum;
    }
}