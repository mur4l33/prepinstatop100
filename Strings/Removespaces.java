public class Removespaces {
    public static void main(String args[]) {
        String s1 = "A1b asd 2C3", s2 = "";
        char[] c = s1.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ' && c[i] != '\t')
                sb.append(c[i]);
        }
        System.out.println(sb);
    }
}
