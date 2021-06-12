import java.util.PriorityQueue;

public class kthMax {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(KthMax(arr, 3));
    }

    static int KthMax(int arr[], int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int i = 0; i < k; i++) {
            q.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > q.peek()) {
                q.poll();
                q.add(arr[i]);
            }
        }
        return q.peek();
    }
}
