import java.util.LinkedList;
import java.util.Queue;

public class firstNegativeElementInKsizeSubarray {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, 6, 7, -4, -9, 8 };

        int k = 3;
        firstNegative(arr, k);
    }

    static void firstNegative(int arr[], int k) {
        Queue<Integer> q = new LinkedList<Integer>();
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] < 0) {
                q.add(arr[j]);
            }
            // WINDOW SIZE HIT
            if ((j - i + 1) == k) {
                if (!q.isEmpty()) {
                    System.out.print(q.peek() + " ");
                    if (arr[i] == q.peek()) {
                        q.poll();
                    }
                } else {
                    System.out.print(0 + " ");
                }
                i++;
            }
            j++;
        }
    }
}
