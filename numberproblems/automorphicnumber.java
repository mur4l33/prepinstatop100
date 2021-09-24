//Square of the number should conatins the number itself at the end 

public interface automorphicnumber {
    public static void main(String args[]) {
        int n = 5;
        String s = Integer.toString(n);
        int nsq = n * n;
        String ns = Integer.toString(nsq);
        String ns3 = ns.substring(ns.length() - s.length());
        System.out.println(
                ns3 + " " + ((ns3.equals(s)) ? " it is automorphic number" : " it is not a automorphic number"));
    }
}
