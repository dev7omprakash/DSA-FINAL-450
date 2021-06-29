import java.util.HashMap;

public class longestSubStringWithKuniqChar {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        int i = 0;
        int j = 0;
        int max = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            if (!mp.containsKey(c)) {
                mp.put(c, 1);
            } else {
                mp.put(c, mp.get(c) + 1);
            }

            if (mp.size() == k) {
                max = Math.max(max, j - i + 1);
            }
            if (mp.size() > k) {
                while (mp.size() > k && i <= j) {
                    char ci = s.charAt(i);
                    mp.put(ci, mp.get(ci) - 1);
                    if (mp.get(ci) == 0) {
                        mp.remove(ci);
                    }
                    i++;
                }
            }
            j++;
        }
        System.out.println(max);
    }
}
