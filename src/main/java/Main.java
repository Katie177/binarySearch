import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Примеры использования методов binarySearch из Arrays

        byte[] byteArray = {1, 3, 5, 7, 9};
        try {
            System.out.println(Arrays.binarySearch(byteArray, (byte) 5));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        try {
            System.out.println(Arrays.binarySearch(charArray, 'c'));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        try {
            System.out.println(Arrays.binarySearch(doubleArray, 5.5));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        try {
            System.out.println(Arrays.binarySearch(floatArray, 5.5f));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        int[] intArray = {10, 20, 30, 40, 50};
        try {
            System.out.println(Arrays.binarySearch(intArray, 30));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        long[] longArray = {1L, 2L, 3L, 4L, 5L};
        try {
            System.out.println(Arrays.binarySearch(longArray, 5L));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        short[] shortArray = {1, 2, 3, 4, 5};
        try {
            System.out.println(Arrays.binarySearch(shortArray, (short) 5));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        Integer[] intArrayC = {10, 20, 30, 40, 50};
        try {
            System.out.println(Arrays.binarySearch(intArrayC, 30, Comparator.naturalOrder()));
            System.out.println(Arrays.binarySearch(intArrayC, 30, Comparator.reverseOrder()));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Примеры использования методов binarySearch из Collections

        List<Integer> list = List.of(10, 20, 30, 40, 50);
        try {
            int index1 = Collections.binarySearch(list, 30); // Ожидается: 2
            System.out.println("Index of 30: " + index1);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
