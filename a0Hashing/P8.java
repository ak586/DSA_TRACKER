package a0Hashing.a18_03_24;

import java.util.*;

public class P8 {
    static boolean pairSum(int arr[], int target) {
        Set<Integer> st = new HashSet<>();
        for (int x : arr) {
            if (st.contains(target - x))
                return true;
            st.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int x = -2;
        System.out.println(pairSum(arr, x));
    }
}
