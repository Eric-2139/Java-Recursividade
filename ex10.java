import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dividendo: ");
        int x = scan.nextInt();

        System.out.println("Digite o divisor: ");
        int y = scan.nextInt();

        System.out.println("O resto da divisão " + x + "/" + y + " é: " + mod(x, y));

        scan.close();
    }

    public static int mod(int x, int y) {
        if (x > y) {
            return mod(x - y, y);
        } else if (x < y) {
            return x;
        } else {
            return 0;
        }
    }
}
