package a3DP;

import java.util.*;

public class Frog2 {
    static int min(int a, int b) {
        return Math.min(a, b);
    }

    static int abs(int a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int h[] = new int[n + 1];
        for (int i = 1; i <= n; i++)
            h[i] = in.nextInt();
        int dp[] = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        dp[2] = abs(h[2] - h[1]);
        for (int i = 3; i <= n; i++) {
            for (int step = 1; step <= k && i - step > 0; step++) {
                dp[i] = min(dp[i], dp[i - step] + abs(h[i] - h[i - step]));
            }
        }
        System.out.println(dp[n]);
        in.close();

    }
}
