public class basic {
    public static void main(String[] args) {
        int n = 5, m = 6, cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cnt++;
            }
        }
        System.err.println(cnt);
    }
}
