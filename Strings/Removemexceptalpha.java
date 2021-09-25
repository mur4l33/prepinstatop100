public class Removemexceptalpha {
    public static void main(String args[]) {
        String s1 = "A1b2C3", s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            int c = s1.charAt(i);
            if ((c >= 65 && c <= 90) || (c <= 124 && c >= 90)) {
                s2 = s2 + s1.charAt(i);
            }
        }
        System.out.println("removed string is " + s2);
    }
}
