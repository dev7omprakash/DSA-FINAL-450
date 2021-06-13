public class moveAllNegativeAside {
    public static void main(String[] args) {
        int arr[] = { 1, 2, -2, -3, 4, -5, -6 };
        moverAllNegativeASide(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void moverAllNegativeASide(int arr[]) {
        int i = -1;
        int pivot = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
