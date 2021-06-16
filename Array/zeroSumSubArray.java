import java.util.HashSet;
import java.util.Set;

public class zeroSumSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 2, -1, 2 };
        System.out.println(zeroSum(arr));
    }

    static boolean zeroSum(int arr[]) {
        Set<Integer> s = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0 || arr[i] == 0 || s.contains(sum)) {
                return true;
            }
            s.add(sum);
        }
        return false;
    }
}
