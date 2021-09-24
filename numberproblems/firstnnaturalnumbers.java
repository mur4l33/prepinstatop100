import java.util.Scanner;

//Sum of First N Natural numbers:

public class firstnnaturalnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = x * (x + 1) / 2;
        System.out.println("Sum of N natural Numbers" + sum);

    }
}