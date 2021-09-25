import java.util.Arrays;

public class anagram {
    public static void main(String args[]) {
        boolean p = true;
        String s1 = "prepinsta";
        String s2 = "instaprep";
        if (s1.length() != s2.length()) {
            p = false;
        }
        char[] c1 = s1.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        char[] c2 = s2.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                p = false;
                break;
            }
        }
        System.out.print((p) ? (s1 + " is a anagram od" + s2) : (s1 + " is not a anagram od" + s2));
    }
}
