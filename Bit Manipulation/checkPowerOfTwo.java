import java.io.BufferedReader;
import java.io.InputStreamReader;

public class checkPowerOfTwo {
    public static void main(String[] args) throws Exception {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(sc.readLine());

        System.out.println(isPowerofTwo(N));
    }

    // Function to check if given number n is a power of two.
    static boolean isPowerofTwo(long n) {
        // Corner case for n=0
        if (n == 0)
            return false;
        // N and N-1 have same digit untill the right most Set bit
        // after that all the bit are flipped.
        // and we know that if number is power of 2 then except the left most set bit
        // all the bit is 0.

        if ((n & (n - 1)) == 0)
            return true;
        return false;

    }
}
