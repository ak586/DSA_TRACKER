package a3DP;

public class MaxSubsetSumWithoutAdjacent {
    public static void main(String[] args) {
        int arr[] = { 2, -3, 5, -8, 7 };

        int dp[] = new int[arr.length];
        dp[0] = Math.max(0, arr[0]); // for case like [-1, -2, -3, -4] where the starting elements are negative
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < dp.length; i++) {
            int choice1 = dp[i - 2] + arr[i];// include current element
            int choice2 = dp[i - 1]; // don't include second element
            dp[i] = Math.max(choice1, choice2);
        }
        System.out.println(dp[arr.length - 1]);
    }
}
