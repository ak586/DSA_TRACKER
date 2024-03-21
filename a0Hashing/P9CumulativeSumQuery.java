package a0Hashing.a18_03_24;

import java.util.*;

public class P9CumulativeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < n; i++)
            ls.add(sc.nextInt());
        int q = sc.nextInt();
        int prefixSum[] = new int[n + 1];
        int currSum = 0;
        int ind = 1;
        for (int num : ls) {
            currSum += num;
            prefixSum[ind++] = currSum;
        }
        System.out.println(Arrays.toString(prefixSum));

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(prefixSum[y + 1] - prefixSum[x]);
        }
    }
}
