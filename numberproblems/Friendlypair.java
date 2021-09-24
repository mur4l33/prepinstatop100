//Sum of factors of first number is equal to the sum of factor second number 
//ex : 220 =>284 284 => 220
public class Friendlypair {
    public static int sfactor(int n) {
        int fac = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                fac += i;
            }
        }
        return fac;
    }

    public static void main(String args[]) {
        int n1 = 284, n2 = 220;
        System.out.println(sfactor(n1) + " " + sfactor(n2) + " "
                + ((sfactor(n1) == n2 && n1 == sfactor(n2)) ? " it is Friendly Pair" : " it is not a Friendly Pair"));
    }
}
