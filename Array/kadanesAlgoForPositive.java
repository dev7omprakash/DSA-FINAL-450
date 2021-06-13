public class kadanesAlgoForPositive {
    public static void main(String[] args) {
        int arr[] = { 1, -1, -2, 3, 4, 1, -3 };

        System.out.println(largestSumContigeousSubArray(arr));

    }

    static int largestSumContigeousSubArray(int arr[]) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
