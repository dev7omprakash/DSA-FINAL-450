import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nonRepeatingNumbers {
    public static void main(String[] args) throws Exception {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(sc.readLine());

        int arr[] = new int[N];
        String line[] = sc.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        int ans[] = singleNumber(arr);
        System.out.println(ans[0] + " " + ans[1]);

    }

    static int[] singleNumber(int[] nums) {
        int n = nums.length;
        int arr[] = new int[2];
        int xors = 0;

        // xoring all the number which will give us the xor of two unique elements

        for (int i = 0; i < n; i++) {
            xors = xors ^ nums[i];
        }

        // getting the postion of right-most set bits

        int pos = getrightmostset(xors);
        // cheking all the numbers whether at the pos index bit is set or not
        // if bit is set then xor it
        int nx = 0;
        for (int i = 0; i < n; i++) {
            if (setbit(nums[i], pos)) {
                nx = nx ^ nums[i];
            }
        }
        // nx and nx2 will store two unique elements
        int nx2 = nx ^ xors;

        arr[0] = nx;
        arr[1] = nx2;

        return arr;

    }

    // this function will check wheather the bit at pos is set or not
    static boolean setbit(int n, int pos) {
        if ((n & (1 << pos)) != 0) {
            return true;
        }
        return false;
    }

    // this function will give the position of right-most set bit
    static int getrightmostset(int n) {
        int pos = 0;
        int flag = 1;
        while (true) {
            if ((n & (flag)) != 0) {
                return pos;
            }
            flag = flag << 1;
            pos++;
        }
    }
}
