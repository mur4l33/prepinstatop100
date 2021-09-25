public class removevowels {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s = "PrePInsTa";
        String s1 = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("New String is" + s1);
    }
}
