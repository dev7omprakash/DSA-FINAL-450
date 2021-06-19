public class smallestSubarrayWithSumGreaterK {
    public static void main(String[] args) {

        int arr[] = { 1, 4, 45, 6, 0, 19 };
        int n = arr.length;
        int k = 51;

        System.out.println(minSubArray(arr, n, k));

    }

    static int minSubArray(int arr[], int n, int k) {
        int i = 0;
        int j = 0;
        int mi = Integer.MAX_VALUE;
        int sum = 0;

        while (i <= j && j < n) {
            while (sum <= k && j < n) {
                sum += arr[j];
                j++;

            }
            while (sum > k && i < j) {
                mi = Math.min(mi, j - i);
                System.out.println(sum);
                sum -= arr[i];
                i++;
            }
        }
        return mi;
    }
}
