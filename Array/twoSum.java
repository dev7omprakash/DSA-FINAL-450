import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 8, 9, 6 };
        int sum = 10;
        System.out.println(countPair(arr, sum));
    }

    static int countPair(int arr[], int sum) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int x = sum - arr[i];
            if (map.containsKey(x)) {
                count += map.get(x);
            }
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i] + 1));
            }
        }
        return count;
    }
}
