public class minimumMergeRequiredToMakeArrayPalindrome {

    public static void main(String[] args) {
        int arr[] = { 4, 1, 7, 6, 1, 5 };
        // 4+1 will be merge to get 5
        // and 6+1 will be merge to get 7
        // and arr will become [5,7,7,5] which is a palindrome
        int count = 0;

        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[j] > arr[i]) {
                i++;
                arr[i] += arr[i - 1];
                count++;
            } else {
                j--;
                arr[j] += arr[j + 1];
                count++;
            }
        }
        System.out.println(count);

    }

}
