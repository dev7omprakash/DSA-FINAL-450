public class longestSubaarayWithSumlessThanK {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 5, 6, 0, 19 };
        String s = "";
        for (int i = 0; i < arr.length; i++)
            s += String.valueOf(arr[i]);
        int k = 21;

        int max = 0;
        int sum = 0;
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            sum += arr[j];

            if (sum < k) {
                max = Math.max(max, j - i + 1);
            }
            if (sum > k) {
                while (sum > k && i <= j) {
                    sum -= arr[i];
                    i++;
                }
            }
            j++;
        }
        System.out.println(max);
    }
}
