public class consecutiveOneIII {
    public static void main(String[] args) {
        // Q.. Given a binary array nums and an integer k,
        // return the maximum number of consecutive 1's in
        // the array if you can flip at most k 0's.
        int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(longestOnes(arr, k));

    }

    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int i = 0;
        int j = 0;
        int arr[] = new int[2];
        while (j < nums.length) {
            arr[nums[j]]++;
            if (arr[0] <= k) {
                max = Math.max(j - i + 1, max);
            }
            if (arr[0] > k) {
                while (arr[0] > k && i <= j) {
                    arr[nums[i]]--;
                    i++;
                }
            }
            j++;
        }
        return max;
    }
}