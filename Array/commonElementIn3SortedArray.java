public class commonElementIn3SortedArray {
    public static void main(String[] args) {
        int arr1[] = { 2, 3, 4, 5, 8, 10 };
        int arr2[] = { 4, 8, 10, 13, 15 };
        int arr3[] = { 8, 10, 30, 40, 58, 60 };

        commonElment(arr1, arr2, arr3);
    }

    static void commonElment(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
