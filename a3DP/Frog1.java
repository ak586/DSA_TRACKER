package a3DP;

import java.util.Scanner;

/* 
 * Problem Statement: https://atcoder.jp/contests/dp/tasks/dp_a
There are 
N stones, numbered 
1,2,…,N. For each 
i (
1≤i≤N), the height of Stone 
There is a frog who is initially on Stone 
1. He will repeat the following action some number of times to reach Stone 
N:
If the frog is currently on Stone 
i, jump to Stone  i+1 or Stone i+2. 
Here, a cost of abs(h[i]-h[j]) is incurred, where 
j is the stone to land on.
Find the minimum possible total cost incurred before the frog reaches Stone 
N
*/

public class Frog1 {
    static int abs(int a, int b) {
        return Math.abs(a - b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();

        int dp[] = new int[n + 1];
        dp[1] = 0;
        dp[2] = Math.abs(arr[2] - arr[1]);

        dp[3] = Math.min(abs(arr[1], arr[3]), dp[2] + abs(arr[2], arr[3]));
        for (int i = 4; i <= n; i++) {
            int jump1 = dp[i - 1] + abs(arr[i], arr[i - 1]);
            int jump2 = dp[i - 2] + abs(arr[i], arr[i - 2]);
            dp[i] = Math.min(jump1, jump2);
        }
        System.out.println(dp[n]);
        sc.close();

    }
}
