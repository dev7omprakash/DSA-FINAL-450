public class duplicatedInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 3, 4, 1 };
        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % arr.length] = arr[arr[i] % arr.length] + arr.length;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] / arr.length > 1)
                System.out.print(i + " ");
        }
    }
}
