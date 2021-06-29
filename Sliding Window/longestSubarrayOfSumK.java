import java.util.HashMap;

public class longestSubarrayOfSumK {
    public static void main(String[] args) {

        /// TODO:This approach is valid for array contains postive nad negative element

        int arr[] = { 10, 5, 2, -7, 1, 14, -10 };
        int k = 15;

        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                len = i + 1;
            }
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
            if (mp.containsKey(k - sum)) {
                len = Math.max(len, i - mp.get(sum - k));
            }
        }
        System.out.println(len);
    }
}

// TODO: this approach is val for array contains onle positive elements

// int sum=0; int max=0;
// int j=0;;
// while(j<n){
// int i=0;
// sum+=arr[j];
// if(sum==k){
// max=Math.max(max,j-i+1);
// }
// if(sum>k){
// while(sum>k && i<=j){
// sum-=arr[i];
// if(sum==k){
// max=Math.max(max,j-i+1);
// }
// i++;
// }
// }
// j++;
// }
// System.out.println(max);
