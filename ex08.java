public class ex08 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("A soma dos valores do vetor é: " + sum(arr));
    }

    public static int sum(int[] array) {
        return sumHelper(array, 0);
    }

    private static int sumHelper(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + sumHelper(array, index + 1);
    }

}
