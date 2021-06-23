public class maxSumOfKSizeSubArrray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -1, 5, -5 };
        int k = 3;
        System.out.println(sum(arr, k));
    }

    static int sum(int arr[], int k) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < arr.length) {
            sum += arr[j];

            // WINDOW SIZE HIT
            if ((j - i + 1) == k) {
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return max;
    }
}