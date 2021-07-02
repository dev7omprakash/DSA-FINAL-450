public class floorValue {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 5, 8, 10 };

        System.out.println(floor(arr, 6));
        System.out.println(floor(arr, 5));
        System.out.println(floor(arr, 4));
        System.out.println(floor(arr, 12));
        System.out.println(floor(arr, 1));
    }

    static int floor(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                return arr[mid];
            } else if (arr[mid] < k) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return floor;
    }
}
