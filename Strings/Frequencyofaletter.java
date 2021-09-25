public class Frequencyofaletter {
    public static void main(String args[]) {
        String str = "simbainuaa";
        int[] count = new int[str.length()];
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j] == ch[i]) {
                    count[i]++;
                    ch[j] = '0';
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (ch[i] != '0' && ch[i] != ' ') {
                System.out.println(ch[i] + " " + count[i]);
            }
        }
    }
}
