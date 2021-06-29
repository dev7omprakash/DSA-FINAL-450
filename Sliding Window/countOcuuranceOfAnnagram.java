import java.util.HashMap;

public class countOcuuranceOfAnnagram {
    public static void main(String[] args) {
        String s = "aabaabaa";
        String t = "aaba";
        int res = 0;
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!mp.containsKey(c)) {
                mp.put(c, 1);
            } else {
                mp.put(c, mp.get(c) + 1);
            }
        }
        int count = mp.size();

        int i = 0;
        int j = 0;
        while (j < s.length()) {
            char sc = s.charAt(j);
            if (mp.containsKey(sc)) {
                mp.put(sc, mp.get(sc) - 1);
                if (mp.get(sc) == 0) {
                    count--;
                }
            }
            if ((j - i + 1) == t.length()) {
                if (count == 0) {
                    System.out.println(s.substring(i, j + 1));
                    res++;
                }
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
        System.out.println(res);

    }

}
