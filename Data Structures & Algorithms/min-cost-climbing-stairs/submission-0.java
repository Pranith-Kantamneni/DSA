class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;

        int dp[] = new int[n];

        return Math.min(
            stepcount(0, n, dp, cost),
            stepcount(1, n, dp, cost)
        );
    }

    public static int stepcount(int i, int n, int dp[], int cost[]) {

        if(i >= n){
            return 0;
        }

        if(dp[i] != 0){
            return dp[i];
        }

        dp[i] = cost[i] + Math.min(
            stepcount(i + 1, n, dp, cost),
            stepcount(i + 2, n, dp, cost)
        );

        return dp[i];
    }
}