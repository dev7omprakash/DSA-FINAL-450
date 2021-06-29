import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class maxInSubarrayOfK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6, 3 };
        int k = 3;
        Deque<Integer> q = new ArrayDeque<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            while (!q.isEmpty() && q.peekLast() < arr[j]) {
                q.pollLast();
            }
            q.addLast(arr[j]);
            if ((j - i + 1) == k) {
                ans.add(q.peekFirst());
                if (arr[i] == q.peekFirst()) {
                    q.pollFirst();
                }
                i++;
            }
            j++;
        }
        System.out.println(ans);
    }
}
