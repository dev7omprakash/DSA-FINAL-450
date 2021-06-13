import java.util.HashSet;
import java.util.Iterator;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6, 8 };
        int arr2[] = { 2, 3, 4, 7, 9 };

        // as we can see union and intersection must be 1,2,3,4,5,6,7,8,9 and 2,4
        // respectively.
        union(arr1, arr2);
        System.err.println();
        intersection(arr1, arr2);
    }

    static void intersection(int arr1[], int arr2[]) {
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            }
        }
    }

    static void union(int arr1[], int arr2[]) {
        HashSet<Integer> unio = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            unio.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            unio.add(arr2[i]);
        }

        Iterator itr = unio.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
