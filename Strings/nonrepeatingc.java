public class nonrepeatingc {
    public static void main(String args[]) {
        String s1 = "prepinsta";
        s1 = s1.toLowerCase();
        int[] count = new int[s1.length()];
        char[] ch = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            count[i] = 1;
            for (int j = i + 1; j < s1.length(); j++) {
                if (ch[i] == ch[j]) {
                    count[i]++;
                    ch[j] = '0';
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                System.out.println(s1.charAt(i) + " ");
            }
        }
    }
}
