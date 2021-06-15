import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}

class FractionalKnapsack {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0, k = 0; i < n; i++) {
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }

            System.out.println(String.format("%.2f", fractionalKnapsack(w, arr, n)));
        }
    }

    static double fractionalKnapsack(int W, Item arr[], int n) {

        Arrays.sort(arr, new Comparator<Item>() {

            public int compare(Item i, Item j) {
                double v1 = (double) i.value / (double) i.weight;
                double v2 = (double) j.value / (double) j.weight;
                if (v2 > v1)
                    return 1;
                else if (v1 > v2)
                    return -1;
                return 0;
            }

        });

        double ans = 0;

        for (int i = 0; i < n; i++) {
            if (W >= arr[i].weight) {
                ans += arr[i].value;
                W -= arr[i].weight;
                continue;
            }
            double v = (double) arr[i].value / (double) arr[i].weight;
            ans += v * W;
            W = 0;
            break;
        }

        return ans;

    }
}// } Driver Code Ends

/*
 * class Item { int value, weight; Item(int x, int y){ this.value = x;
 * this.weight = y; } }
 */

// Function to get the maximum total value in the knapsack.
