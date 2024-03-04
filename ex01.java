
public class ex01 {

    public static int somaR(int n) {
        if (n == 1) {
            return 1;
        } else {
            return somaR(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        System.out.println(somaR(1));
        System.out.println(somaR(2));
        System.out.println(somaR(3));
        System.out.println(somaR(4));
    }
}