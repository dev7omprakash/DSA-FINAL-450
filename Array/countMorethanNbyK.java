public class countMorethanNbyK {
    static class pair {
        int val;
        int count;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 2, 1, 2, 3, 3 };
        int k = 4;
        int n = 8;

        checkNbyK(arr, k, n);
    }

    static void checkNbyK(int arr[], int k, int n) {

        pair temp[] = new pair[k - 1];

        for (int i = 0; i < k - 1; i++) {
            temp[i] = new pair();
        }
        for (int i = 0; i < k - 1; i++) {
            temp[i].count = 0;
        }

        for (int i = 0; i < n; i++) {
            int j;

            for (j = 0; j < k - 1; j++) {

                if (temp[j].val == arr[i]) {
                    temp[j].count += 1;
                    break;
                }
            }
            if (j == k - 1) {
                int l;
                for (l = 0; l < k - 1; l++) {
                    if (temp[l].count == 0) {
                        temp[l].val = arr[i];
                        temp[l].count = 1;
                        break;

                    }
                }
                if (l == k - 1) {
                    for (l = 0; l < k - 1; l++) {
                        temp[l].count -= 1;
                    }
                }

            }
        }

        for (int i = 0; i < k - 1; i++) {
            int ac = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == temp[i].val) {
                    ac++;
                }
            }
            if (ac > n / k) {
                System.out.print(temp[i].val + " ");
            }
        }
    }
}
