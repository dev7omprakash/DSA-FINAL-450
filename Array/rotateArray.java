public class rotateArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int d = 2;
        rotateArrayLeft(arr, d);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void rotateArrayLeft(int arr[], int d) {
        rotateArry(arr, 0, d - 1);
        rotateArry(arr, d, arr.length - 1);
        rotateArry(arr, 0, arr.length - 1);
    }

    static void rotateArry(int arr[], int i, int j) {
        int f = i;
        int s = j;
        while (f <= s) {
            int temp = arr[f];
            arr[f] = arr[s];
            arr[s] = temp;
            f++;
            s--;
        }

    }
}
