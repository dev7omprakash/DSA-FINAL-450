import java.util.HashSet;
import java.util.Set;

public class threeSum {
    static class Triple {
        int x, y, z;

        public Triple(int x, int y, int z) {
            this.x = x;
            this.z = z;
            this.y = y;

        }

        public String toString() {
            return this.x + " " + this.y + " " + this.z;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6, 2, 8, 4 };
        int sum = 7;
        System.out.println(findTriplets(arr, sum));
    }

    static Set<Triple> findTriplets(int arr[], int sum) {
        Set<Triple> ans = new HashSet<Triple>();
        Set<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < arr.length - 2; i++) {
            int currsum = sum - arr[i];

            // TODO:concept of two sum

            for (int j = i + 1; j < arr.length; j++) {
                if (s.contains(currsum - arr[j])) {
                    ans.add(new Triple(arr[i], arr[j], currsum - arr[j]));
                }
                s.add(arr[j]);
            }
        }
        return ans;
    }
}
