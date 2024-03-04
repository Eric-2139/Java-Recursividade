import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número base:");
        int x = scan.nextInt();

        System.out.println("Digite a potência:");
        int k = scan.nextInt();

        System.out.println("Resultado: " + expo(x, k));

        scan.close();
    }

    public static int expo(int x, int k) {
        if (k == 0) {
            return 1;
        } else if (k == 1){
            return x;
        } else {
            return x * expo(x, k - 1);
        }
    }
}

