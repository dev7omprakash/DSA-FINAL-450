import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) throws Exception {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String line = sc.readLine();

        System.out.println(Power(line));

    }

    static List<String> Power(String s) {
        List<String> a = new ArrayList<>();
        for (int i = 0; i < (1 << s.length()); i++) {
            String an = "";
            for (int j = 0; j < s.length(); j++) {
                if ((i & (1 << j)) != 0) {
                    an += Character.toString(s.charAt(j));
                }
            }
            a.add(an);
        }
        Collections.sort(a);
        a.remove(0);
        return a;
    }
}
