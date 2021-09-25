public class Removebrackets {
    public static void main(String args[]) {
        String s1 = "(x+y)=z";
        String s2 = s1.replaceAll("[(){}]", "");
        System.out.println("removed string is " + s2);
    }
}
