import java.io.BufferedReader;
import java.io.InputStreamReader;

public class copySetBitInRange {

    public static void main(String[] args) throws Exception {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String line[] = sc.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int l = Integer.parseInt(line[2]);
        int r = Integer.parseInt(line[3]);
        System.out.println(solve(n, m, l, r));
    }

    static int solve(int n, int m, int l, int r) {

        for (int i = l; i <= r; i++) {

            int mask = 1 << (i - 1);

            if ((m & mask) != 0) {
                n = (n | (mask));

            }
        }
        return n;
    }
}
