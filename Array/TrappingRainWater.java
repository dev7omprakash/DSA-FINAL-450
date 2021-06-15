public class TrappingRainWater {
    public static void main(String[] args) {

        int arr[] = { 3, 2, 1, 0, 1, 2, 3 };

        System.out.println(rainCount(arr));
    }

    static int rainCount(int arr[]) {
        int absMaxtoRight[] = new int[arr.length];
        int absMaxtoLeft[] = new int[arr.length];
        absMaxtoLeft[0] = arr[0];
        int maxLeft = arr[0];

        absMaxtoRight[arr.length - 1] = arr[arr.length - 1];
        int maxRight = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxLeft) {
                maxLeft = arr[i];
            }
            absMaxtoLeft[i] = maxLeft;
            if (arr[arr.length - 1 - i] > maxRight) {
                maxRight = arr[arr.length - 1 - i];
            }
            absMaxtoRight[arr.length - 1 - i] = maxRight;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            absMaxtoRight[i] = Math.abs(arr[i] - Math.min(absMaxtoRight[i], absMaxtoLeft[i]));
            sum += absMaxtoRight[i];
        }
        return sum;
    }
}
