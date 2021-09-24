import java.util.Scanner;

public class Sumofrange {
    public int sumofn(int n) {
        return (n * (n + 1) / 2);
    }

    int sumofrange(int s, int l) {
        return sumofn(l) - sumofn(s);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range no:");
        int s = sc.nextInt();
        System.out.println("Enter the Ending range no:");
        int l = sc.nextInt();
        Sumofrange sr = new Sumofrange();
        System.out.println(sr.sumofrange(s, l));
    }
}
