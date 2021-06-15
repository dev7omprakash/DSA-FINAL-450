public class minimumSwapRequiredToBringElementLessThanK {
    public static void main(String[] args) {

        int arr[] = { 9, 1, -1, 5, 8, 2, 3, 0, 4, 6 };
        int k = 3;
        System.out.println(minimumSwap(arr, k));

    }

    static int minimumSwap(int arr[], int k) {
        int countLessThanK = 0;
        int countGreaterThanK = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                countLessThanK++;
            }
        }

        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;

        while (j < arr.length) {
            if (arr[j] > k) {
                countGreaterThanK++;
            }
            if (j - i + 1 == countLessThanK) {
                min = Math.min(min, countGreaterThanK);
                if (arr[i] > k) {
                    countGreaterThanK--;

                }
                i++;
            }
            j++;

        }
        return min;
    }
}
