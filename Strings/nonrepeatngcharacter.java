public class nonrepeatngcharacter {
    public static void main(String args[]) {
        String str = "simbainuaa";
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] == 1) {
                System.out.println((char) i + " ");
            }
        }
    }
}
