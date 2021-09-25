public class Sumofdigitinstring {
    public static void main(String args[]) {
        String s1 = "pr2ep4in5st1";
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i))) {
                sum += Character.getNumericValue(s1.charAt(i));
            }
        }
        System.out.println("removed string is " + sum);
    }
}
