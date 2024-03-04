public class ex02 {
    
    public static double dividiR(double n) {
        if (n == 1) {
            return 1;
        } else {
            return dividiR(n - 1) + 1 / n;
        }                           
    }

    public static void main(String[] args) {
        System.out.println(dividiR(1));
        System.out.println(dividiR(2));
        System.out.println(dividiR(3));
        System.out.println(dividiR(4));
    }
}
