class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int dp[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return countmax(nums, n - 1, 0, dp);
    }

    public static int countmax(int[] nums, int n, int last, int[][] dp) {

        if (n == 0) {
            if (last == 1) {
                return 0;
            }
            return nums[0];
        }

        if (n == 1) {
            if (last == 0) {
                return Math.max(nums[0], nums[1]);
            }
            return nums[1];
        }

        if (dp[n][last] != -1) {
            return dp[n][last];
        }

        int ans;

        if (n == nums.length - 1) {
            ans = Math.max(
                nums[n] + countmax(nums, n - 2, 1, dp),
                countmax(nums, n - 1, 0, dp)
            );
        } else {
            int a = nums[n] + countmax(nums, n - 2, last, dp);
            int b = countmax(nums, n - 1, last, dp);

            ans = Math.max(a, b);
        }

        dp[n][last] = ans;
        return ans;
    }
}