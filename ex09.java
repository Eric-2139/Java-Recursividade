import java.util.Arrays;

public class ex09 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr, 0);
        System.out.println(Arrays.toString(arr)); // [5, 4, 3, 2, 1]
    }

    public static void reverse(int[] array, int index) {
        if (index == array.length / 2) {
            return;
        }
        int temp = array[index];
        array[index] = array[array.length - 1 - index];
        array[array.length - 1 - index] = temp;
        reverse(array, index + 1);
    }

}
