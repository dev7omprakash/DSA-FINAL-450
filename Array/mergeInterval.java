import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class mergeInterval {
    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public String toString() {
            return this.start + " " + this.end;
        }
    }

    public static void main(String[] args) {

        Interval arr[] = { new Interval(1, 4), new Interval(7, 16), new Interval(2, 4), new Interval(5, 8),
                new Interval(7, 10) };

        Stack<Interval> ans = merge(arr);
        System.out.println(ans);

    }

    static Stack<Interval> merge(Interval arr[]) {
        Stack<Interval> s = new Stack<Interval>();
        if (arr.length == 0)
            return s;

        Arrays.sort(arr, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        s.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            Interval top = s.peek();

            if (top.end < arr[i].start)
                s.push(arr[i]);
            else if (top.end >= arr[i].start) {
                top.end = Math.max(top.end, arr[i].end);
                s.pop();
                s.push(top);
            }
        }
        return s;
    }
}
