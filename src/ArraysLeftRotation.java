import java.util.Arrays;

public class ArraysLeftRotation {
    static int[] rotLeft(int[] a, int d) {
        int[] arr = Arrays.copyOf(a, a.length);
        for (int i = 0;  i < arr.length; i ++) {
            int newIndex = (arr.length + (i - d)) % arr.length;
            if (newIndex == arr.length) {
                newIndex = 0;
            }
            arr[newIndex] = a[i];
        }
        return arr;
    }
    public static void main(String [] args) {
        int [] arr = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int rotations = 13;
        System.out.println(Arrays.toString(rotLeft(arr, rotations)));
    }
}
