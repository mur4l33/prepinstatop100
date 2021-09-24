//if the number is divisible to the sum of the digit then harshad 18=>1+8 =9 18%2==0

public class harshadnumber {
    public static void main(String args[]) {
        int n = 18;
        int n1 = n, temp = 0;

        while (n != 0) {
            temp += n % 10;
            n = n / 10;
        }
        System.out.println(
                n1 + " " + temp + " " + ((n1 % temp == 0) ? " it is Harshad number" : " it is not a Harshad number"));
    }
}