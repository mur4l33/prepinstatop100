public class palindrome {
    public static void main(String args[]) {
        String s1 = "abbbba";
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        if (s2.equals(s1)) {
            System.out.print(s2 + " " + s1 + " is  a palindrome");
        } else {
            System.out.print(s2 + " " + s1 + " is  not a palindrome");
        }
    }
}
