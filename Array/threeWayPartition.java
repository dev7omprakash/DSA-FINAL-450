public class threeWayPartition {
    public static void main(String[] args) {
        int arr[] = { 1, 0, -1, 3, 5, 1, 6, 7, 2, 4 };
        int x = 2;
        int y = 4;
        threeWayPartArroundXnY(arr, x, y);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void threeWayPartArroundXnY(int arr[], int a, int b) {

        int n = arr.length;
        int i = 0;
        int j = n - 1;
        for (int k = 0; k <= j; k++) {
            if (arr[k] < a) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                i++;
            } else if (arr[k] > b) {
                int tempj = arr[k];
                arr[k] = arr[j];
                arr[j] = tempj;
                k--;
                j--;
            }
        }
    }
}
