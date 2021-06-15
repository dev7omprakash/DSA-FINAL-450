import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
    static class Job {
        int deadline;
        int profit;

        public Job(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        };
    }

    public static void main(String[] args) {

        Job arr[] = { new Job(4, 20), new Job(1, 10), new Job(1, 40), new Job(1, 30) };
        int ans[] = JobScheduling(arr, arr.length);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

    static int[] JobScheduling(Job arr[], int n) {
        Arrays.sort(arr, new Comparator<Job>() {
            public int compare(Job i, Job j) {
                return j.profit - i.profit;
            }
        });
        boolean flag[] = new boolean[n];

        int day = 0;
        int profit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n - 1, arr[i].deadline - 1); j >= 0; j--) {
                if (flag[j] == false) {
                    day++;
                    profit += arr[i].profit;
                    flag[j] = true;
                    break;
                }
            }
        }
        int ans[] = { day, profit };
        return ans;
    }
}
