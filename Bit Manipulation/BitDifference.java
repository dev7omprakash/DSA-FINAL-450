
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BitDifference {
    public static void main(String[] args) throws Exception {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String line[] = sc.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        System.out.println(countBitsFlip(a, b));

    }

    public static int countBitsFlip(int a, int b) {

        int count = 0;
        int flag = 1;

        while (a > 0 || b > 0) {
            if ((flag & a) != (flag & b)) {
                count++;
            }
            a = a >> 1;
            b = b >> 1;
        }
        return count;

    }
}
