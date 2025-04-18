import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Create a new array to hold both arrays
        int[] combinedArray = new int[array1.length + array2.length];

        // Copy both arrays into the combined array
        System.arraycopy(array1, 0, combinedArray, 0, array1.length);
        System.arraycopy(array2, 0, combinedArray, array1.length, array2.length);

        // Print the combined array
        System.out.println(Arrays.toString(combinedArray));
    }
}
