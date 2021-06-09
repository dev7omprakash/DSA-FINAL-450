import java.io.BufferedReader;
import java.io.InputStreamReader;

public class numberOfSetBit {
    public static void main(String[] args) throws Exception {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(sc.readLine());

        System.out.println(setBits(N));

    }

    static int setBits(int N) {
        // Counter that count the set bit
        int count = 0;
        // N and N-1 have same digit untill the right most Set bit
        // after that all the bit are flipped.
        while (N > 0) {
            N = (N & (N - 1));
            count++;
        }
        return count;

    }

}