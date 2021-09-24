//math.pow is also a method in java.lang.math;

public class powerofanumber {
    public static void main(String args[]) {
        int n = 2;
        int p = 5;
        int res = 1;
        while (p != 0) {
            res = res * n;
            p--;
        }
        System.out.println(p + " power of n " + n + " is  " + res);
    }
}
