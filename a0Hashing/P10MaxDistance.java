package a0Hashing;

import java.util.*;

class P10MaxDistance {
    int maxDistance(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                ans = Math.max(ans, i - map.get(arr[i]));
                continue;
            }
            map.put(arr[i], i);
        }
        return ans;
    }

}
