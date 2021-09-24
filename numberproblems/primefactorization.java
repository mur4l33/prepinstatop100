public class primefactorization {
    public static void main(String args[]) {
        int n = 50;// range
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (arr[i] == false) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }

    }
}
