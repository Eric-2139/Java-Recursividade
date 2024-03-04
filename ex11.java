import java.util.Scanner;

public class ex11 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int x = scan.nextInt();

        System.out.println("Digite um número inteiro: ");
        int y = scan.nextInt();

        System.out.println("O máximo divisor comum de " + x + " e " + y + " é: " + mdc(x, y));

        scan.close();
    }

    public static int mdc(int x, int y) {
        if (x > y) {
            return mdc(x - y, y);
        } else if (x < y) {
            return mdc(y - x, x);
        } else {
            return x;
        }
    }
}
