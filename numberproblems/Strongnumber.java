
//sum of the factorial of the digits of the number is equal to the number
public class Strongnumber {
    public static int fact(int n) {
        int f = 1;
        while (n != 0) {

            f = f * (n);
            n--;
        }
        return f;
    }

    public static void main(String args[]) {
        int n = 145;
        int n1 = n;
        int temp = 0;
        while (n != 0) {
            temp += fact(n % 10);
            n = n / 10;

        }
        System.out.println(n1 + " " + ((temp == n1) ? " it is strong number" : " it is not a strong number"));
    }
}
