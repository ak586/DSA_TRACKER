package a0Hashing.a18_03_24;

import java.util.*;

// Minimum operations to make all elements equal in an array by performing any operation
public class P6 {
    static int minOperations(int arr[]) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int x : arr)
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        int maxFreq = 0;
        for (int k : mp.keySet())
            maxFreq = Math.max(mp.get(k), maxFreq);
        return arr.length - maxFreq;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 4, 5 };
        System.out.println(minOperations(arr));
    }
}
