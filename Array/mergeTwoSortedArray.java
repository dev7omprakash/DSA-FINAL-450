import java.util.Arrays;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 5, 6, 7 };
        int arr2[] = { 0, 2, 3, 4, 6, 8 };

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        merge(arr1, arr2);
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    static void merge(int arr1[], int arr2[]) {
        int i = arr1.length - 1;
        int j = 0;

        while (i >= 0 && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            } else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
