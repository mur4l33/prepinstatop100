//If Abudant, then sum of factors of the number is greater than the number 15 => 1+3+5=9 15>9

public class abudantnumber {
    public static void main(String args[]) {
        int n = 50;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println(
                n + " sum is  " + sum + " " + ((n > sum) ? " it is abudantnumber" : " it is not a abudantnumber"));
    }
}
