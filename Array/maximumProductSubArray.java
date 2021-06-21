public class maximumProductSubArray {
    public static void main(String[] args) {
        int arr[] = { -1, 5, 3, -2, 4, 5, 2 };
        int curMax = arr[0];
        int curMin = arr[0];
        int preMax = arr[0];
        int preMin = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            curMax = Math.max(preMax * arr[i], Math.max(preMin * arr[i], arr[i]));
            curMin = Math.min(preMax * arr[i], Math.min(preMin * arr[i], arr[i]));
            ans = Math.max(curMax, ans);
            preMax = curMax;
            preMin = curMin;
        }
        System.out.println(ans);
    }
}
