public class Primenumber {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n1=sc.nextInt();
        // int n2=sc.nextInt();

        int n1 = 13;
        int mid = n1 / 2;
        boolean flag = false;
        for (int i = 2; i <= mid; i++) {
            if (n1 % i == 0) {
                flag = true;
                break;
            }

        }
        System.out.println("the " + n1 + " is " + (flag ? "not a prime " : " is a prime no"));
    }
}
