public class noOfTimesArrayIsRotated {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 2, 3, 4 };
        System.out.println(noOfTimesArray(arr));

    }

    static int noOfTimesArray(int arr[]) {
        int res = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                res = left;
                break;
            }
            int mid = left + (right - left) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;

            if (arr[mid] <= arr[next] && arr[mid] < arr[prev]) {
                res = mid;
                break;
            } else if (arr[left] <= arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return (arr.length - res) % arr.length;

    }
}
