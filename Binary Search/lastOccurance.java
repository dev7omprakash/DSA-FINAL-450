public class lastOccurance {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 3, 5, 7, 7, 7, 7 };
        System.out.println(latOccur(arr, 3));
        System.out.println(latOccur(arr, 1));
        System.out.println(latOccur(arr, 7));
        System.out.println(latOccur(arr, 0));

    }

    static int latOccur(int arr[], int tar) {
        int res = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == tar) {
                res = mid;
                left = mid + 1;
            } else if (arr[mid] > tar) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}
