//sum of factors of the num is equal to the num 

public class Perfect {
    public static void main(String args[]) {
        int n = 496;
        int n1 = n, temp = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                temp += i;
            }
        }
        System.out.println(temp + " " + ((temp == n1) ? " it is perfect number" : " it is not a perfect number"));
    }

}
