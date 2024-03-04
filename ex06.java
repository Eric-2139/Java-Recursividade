import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo: ");
        int n = scan.nextInt();

        System.out.println("O " + (n + 1) + "º número da sequência de Pell é: " + pell(n));

        scan.close();
    }

    public static int pell(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return 2 * pell(n - 1) + pell(n - 2);
        }
    }
}