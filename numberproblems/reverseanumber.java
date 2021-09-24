public class reverseanumber {
    public static void main(String args[]) {
        int n = 541;
        int rev = 0;
        while (n != 0) {
            rev = n % 10 + rev * 10;
            n = n / 10;
        }
        System.out.print("reverse is " + rev);
    }

}
