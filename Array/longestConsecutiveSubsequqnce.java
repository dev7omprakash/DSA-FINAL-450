import java.util.HashSet;

public class longestConsecutiveSubsequqnce {
    public static void main(String[] args) {

        int arr[] = { 2, 6, 9, 1, 4, 5, 3 };
        System.out.println(longCount(arr));

    }

    static int longCount(int arr[]) {
        HashSet<Integer> mp = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            mp.add(arr[i]);
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!mp.contains(arr[i] - 1)) {
                int count = 0;
                int k = arr[i];
                while (mp.contains(k++)) {
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
