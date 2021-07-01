public class searchInReverseSortedArray {
    public static void main(String[] args) {
        int arr[] = { 7, 5, 4, 3, 1, 0 };
        System.err.println(binarySearch(arr, 4));
        System.err.println(binarySearch(arr, 7));
        System.err.println(binarySearch(arr, 0));
        System.err.println(binarySearch(arr, 2));
    }

    static int binarySearch(int arr[], int tar) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] > tar) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
