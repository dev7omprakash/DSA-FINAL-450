import java.io.BufferedReader;
import java.io.InputStreamReader;

public class findPositionOfSetBit {
    public static void main(String[] args) throws Exception {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String line[] = sc.readLine().split(" ");

        int a = Integer.parseInt(line[0]);

        System.out.println(findPosition(a));
    }

    // This function will return postion 1st set bit if number containing 0 or more
    // than one
    // set bit then it will return -1
    static int findPosition(int N) {

        int count = 0;

        int flag = 1;

        int pos = -1;

        int i = 1;

        while (N > 0) {
            if ((N & flag) != 0) {
                count++;
                pos = i;
            }
            N = N >> 1;
            i++;
        }
        if (count == 0 || count > 1) {
            return -1;
        }
        return pos;
    }
}
