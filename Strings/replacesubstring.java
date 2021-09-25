public class replacesubstring {
    public static void main(String args[]) {
        String s1 = "Prep Insta";
        String s2 = "Insta is awesome";
        String s3 = s1.replaceAll("Insta", s2);
        System.out.print(s3);
    }
}
