public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 1, 1, 1, 1 };
        int candidate = findCanidate(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            System.out.println(candidate);
        } else {
            System.out.println(-1);
        }

    }

    static int findCanidate(int arr[]) {
        int count = 1;
        int mi = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[mi] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                mi = i;
                count = 1;
            }
        }
        return arr[mi];
    }
}
