import java.util.SortedSet;
import java.util.TreeSet;

public class chooseAndSwap {
    public static void main(String[] args) {

        String s = "cccccad";
        System.out.println(chooseandswap(s));

    }

    static String chooseandswap(String A) {
        char ans[] = A.toCharArray();
        SortedSet<Character> ts = new TreeSet<>();
        for (int i = 0; i < A.length(); i++) {
            ts.add(A.charAt(i));
        }

        for (int i = 0; i < A.length(); i++) {

            ts.remove(A.charAt(i));
            if (ts.isEmpty())
                break;
            char ch = ts.first();
            if (ch < A.charAt(i)) {
                for (int j = 0; j < A.length(); j++) {
                    if (ans[j] == ch) {
                        ans[j] = A.charAt(i);
                    } else if (ans[j] == A.charAt(i)) {
                        ans[j] = ch;
                    }
                }
                break;
            }
        }
        return new String(ans);
    }
}
