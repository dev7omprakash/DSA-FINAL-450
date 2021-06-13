import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class minimizeTheMaximumDifferenceBWHieghts {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}

class Solution {
    static class pair {
        int val;
        int ind;

        public pair(int val, int ind) {
            this.val = val;
            this.ind = ind;
        }
    }

    int getMinDiff(int[] arr, int n, int k) {
        ArrayList<pair> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] - k >= 0) {
                a.add(new pair(arr[i] - k, i));
            }
            a.add(new pair(arr[i] + k, i));

        }
        Collections.sort(a, new Comparator<pair>() {
            public int compare(pair i1, pair i2) {
                return i1.val - i2.val;
            }
        });
        int ele = 0;
        int flag[] = new int[n];
        int left = 0;
        int right = 0;
        while (ele < n && right < a.size()) {
            if (flag[a.get(right).ind] == 0) {
                ele++;
            }
            flag[a.get(right).ind]++;
            right++;
        }
        int ans = a.get(right - 1).val - a.get(left).val;
        while (right < a.size()) {
            if (flag[a.get(left).ind] == 1) {
                ele--;
            }
            flag[a.get(left).ind]--;
            left++;
            while (ele < n && right < a.size()) {
                if (flag[a.get(right).ind] == 0) {
                    ele++;
                }
                flag[a.get(right).ind]++;
                right++;
            }
            if (ele == n) {
                ans = Math.min(ans, a.get(right - 1).val - a.get(left).val);
            } else {
                break;
            }
        }
        return ans;

    }
}
