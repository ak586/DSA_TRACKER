package a3DP;

public class SumQuery {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        int query[] = { 0, 2, 1, 4 };
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1] + arr[i];
        }
        for (int q : query) {
            System.out.println(dp[q]);
        }
    }
}
