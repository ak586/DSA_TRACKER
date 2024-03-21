package a3DP;

public class MaxSubsetSumWithoutAdjacent2 {
    public static void main(String[] args) {
        int arr1[] = { 1, 5, 3, 21234 };
        int arr2[] = { -4509, 200, 3, 40 };
        int dp[] = new int[arr1.length];
        dp[0] = Math.max(0, Math.max(arr1[0], arr2[0]));
        dp[1] = Math.max(dp[0], Math.max(arr1[1], arr2[1]));
        for (int i = 2; i < dp.length; i++) {
            int take = Math.max(arr1[i], arr2[i]) + dp[i - 2];
            int not_take = dp[i - 1];
            dp[i] = Math.max(take, not_take);
        }
        System.out.println(dp[dp.length - 1]);
    }
}
