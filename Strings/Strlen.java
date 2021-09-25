
//finding the string length without using size() or length()
import java.util.Scanner;

public class Strlen {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s1 = "abc";
        int l1 = 0;
        for (char ch : s1.toCharArray()) {
            l1++;
        }
        System.out.println(l1);
    }
}
