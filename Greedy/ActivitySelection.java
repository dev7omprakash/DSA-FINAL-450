import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {

    public static void main(String[] args) {

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int n = 6;

        new Solution();
        int ans = Solution.maxMeetings(start, end, n);
        System.out.println(ans);
    }
}

class Solution {

    static class pair {
        int f;
        int s;

        public pair(int f, int s) {
            this.s = s;
            this.f = f;
        }
    }
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.

    public static int maxMeetings(int start[], int end[], int n) {

        ArrayList<pair> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(new pair(start[i], end[i]));
        }
        Collections.sort(li, new Comparator<pair>() {

            public int compare(pair i, pair j) {
                if (i.s == j.s) {
                    return i.f - j.f;
                }
                return i.s - j.s;

            }
        });
        int count = 1;
        int i = 0;
        int j = 1;

        while (j < n) {
            if (li.get(i).s < li.get(j).f) {
                count++;
                i = j;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
