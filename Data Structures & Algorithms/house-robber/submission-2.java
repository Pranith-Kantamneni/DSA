class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        int max = calc(nums,nums.length-1,dp);
        return max;
    }

    public static int calc(int[] nums,int n,int[] dp){
        if(n==0)return nums[0];
        if(n==1)return Math.max(nums[1],nums[0]);
        if(dp[n]!= -1){
            return dp[n];
        }
        int a  = nums[n] + calc(nums,n-2,dp);
        int b = calc(nums,n-1,dp);
        dp[n] =  Math.max(a,b); 
        return dp[n];      
    }
}
