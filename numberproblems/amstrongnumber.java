import java.lang.Math;

public class amstrongnumber {
    public static void main(String args[]) {
        int n = 123, n1 = 123;
        int temp = 0;
        int p = 0;
        while (n != 0) {
            p = n % 10;
            temp += Math.pow(p, 3);
            n = n / 10;
        }
        System.out.println(n1 + ((temp == n1) ? " is amstrong" : " not a amstrong"));
    }
}
