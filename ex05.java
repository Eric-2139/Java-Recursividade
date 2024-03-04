import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int n = scan.nextInt();

        System.out.println("O " + n + "º número da sequência de Tribonacci é: " + tribonacci(n));

        scan.close();
    }

    public static long tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
        
    }
}