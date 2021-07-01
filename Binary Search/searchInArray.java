public class searchInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 0));
    }

    static int binarySearch(int arr[], int tar) {
        int res = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] > tar) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
