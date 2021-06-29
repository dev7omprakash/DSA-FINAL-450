import java.util.HashMap;

public class minimumWindowSubString {

    public static void main(String[] args) {
        String s = "TOTMTAPTAT";
        String t = "TTA";
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            if (mp.containsKey(t.charAt(i)))
                mp.put(t.charAt(i), mp.get(t.charAt(i)) + 1);
            else {
                mp.put(t.charAt(i), 1);
            }
        }
        int count = mp.size();
        int min = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char c = s.charAt(j);

            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) - 1);
                if (mp.get(c) == 0) {
                    count--;
                }
            }

            while (count == 0 && i <= j) {
                min = Math.min(min, j - i + 1);
                if (mp.containsKey(s.charAt(i))) {
                    mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
                    if (mp.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        System.out.println(min);
    }

}
