import java.util.Arrays;

public class minimumPlatform {
    public static void main(String[] args) {

        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };

        System.out.println(findPlatform(arr, dep, arr.length));
    }

    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 1;
        int i = 1;
        int j = 0;
        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {
                count++;
                i++;
            } else {
                i++;
                j++;
            }
        }
        return count;
    }

}
