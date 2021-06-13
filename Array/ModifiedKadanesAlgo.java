public class ModifiedKadanesAlgo {
    public static void main(String[] args) {
        int arr[] = { -4, -3, -1, -2, -4, -8 };
        System.out.println(largestSumContigeousSubArray(arr));

    }

    static int largestSumContigeousSubArray(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < arr[i]) {
                sum = arr[i];
            }
            if (sum > max) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
