public class capfirstlastletter {
    public static void main(String args[]) {
        String str = "prep insta top";
        String[] st = str.split("\\s");
        String newstring = "";
        for (String x : st) {
            newstring = newstring + " " + (x.substring(0, 1).toUpperCase() + x.substring(1, x.length() - 1)
                    + x.substring(x.length() - 1).toUpperCase());
        }
        System.out.println(newstring);
    }
}
