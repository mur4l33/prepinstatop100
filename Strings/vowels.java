public class vowels {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s = "PrePInsTa";
        int vowel = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == 'a' || Character.toLowerCase(s.charAt(i)) == 'e'
                    || Character.toLowerCase(s.charAt(i)) == 'i' || Character.toLowerCase(s.charAt(i)) == 'o'
                    || Character.toLowerCase(s.charAt(i)) == 'o')
                vowel++;
        }
        System.out.println("No of vowels in the string " + vowel);
    }
}
