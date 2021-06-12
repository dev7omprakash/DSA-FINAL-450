public class minAndMaxInMinimumComparison {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 0;
        if (arr.length % 2 == 0) {
            i = 2;
            if (arr[0] > arr[1]) {
                min = arr[1];
                max = arr[0];
            } else {
                min = arr[0];
                max = arr[1];
            }
        } else {
            i = 1;
            min = arr[0];
            max = arr[0];
        }

        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i + 1] < min) {
                    min = arr[i + 1];
                }
            } else {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i + 1] > max) {
                    max = arr[i + 1];
                }
            }
            i += 2;
        }
        System.out.println(min + " " + max);
    }
}
