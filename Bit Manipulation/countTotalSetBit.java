import java.io.BufferedReader;
import java.io.InputStreamReader;

public class countTotalSetBit {
    public static void main(String[] args) throws Exception {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(sc.readLine());

        System.out.println(countSetBits(N));

    }

    public static int countSetBits(int n) {
        // base case
        if (n == 0)
            return 0;
        // maximum power of 2 in the range of n
        int x = maxpowerof2(n);

        // total set bit upto maximum power of 2 in the range of n
        int setbituptox = x * (1 << (x - 1));

        // total leftmost set bit after maximum power of 2 in the range of n
        // 8->[1]000---->000
        // 9->[1]001---->001
        // 10->[1]010---->010
        // 11->[1]011---->011
        int bitafterxleft = n - (1 << x) + 1;

        // sum of these two and solving for remaing numbers
        return setbituptox + bitafterxleft + countSetBits(n - (1 << x));

    }

    // this function will return the maximum power of 2 in the range of n
    // for n=11 it will return 3 because of 2^3=8
    static int maxpowerof2(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;
    }
}
