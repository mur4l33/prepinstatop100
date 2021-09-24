//Leap year or not: 
public class leapyrornot {
    public static Boolean lp(int x) {
        return ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0)) ? true : false;
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        int yr = 1996;
        int yr2 = 1997;
        System.out.println(yr + " is a " + lp(yr));
        System.out.println(yr2 + " is a " + lp(yr2));
    }
}
