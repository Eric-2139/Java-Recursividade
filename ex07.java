import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um número inteiro: ");
        int numberToCheck = scan.nextInt();

        System.out.println(checkNumber(array, numberToCheck, 0));

        scan.close();
    }

    public static boolean checkNumber(int[] array, int number, int index) {
        
        if (index == array.length) {
            return false;
        }

        if (array[index] == number) {
            return true;
        }

        return checkNumber(array, number, index + 1);
    }
}
