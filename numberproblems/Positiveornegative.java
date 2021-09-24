import java.util.*;

public class Positiveornegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0) {
            System.out.println("Negative Number");
        } else if (x > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("zero");
           }
    }
}