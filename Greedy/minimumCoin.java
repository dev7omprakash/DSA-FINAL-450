import java.util.Arrays;
import java.util.Collections;

public class minimumCoin {
    public static void main(String[] args) {
        int denomination[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int amount = 347;

        System.out.println(minCoin(denomination, amount));

    }

    static int minCoin(int denominatio[], int amount) {
        // Arrays.sort(denominatio,Collections.reverseOrder());

        int count = 0;

        for (int i = 0; i < denominatio.length; i++) {
            count += amount / denominatio[i];
            amount -= (amount / denominatio[i]) * denominatio[i];
        }
        return count;
    }
}
