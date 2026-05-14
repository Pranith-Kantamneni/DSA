class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i] = -1;
        }
        int count = stepcount(n,dp);
        return count;
    }

    public static int stepcount(int n,int dp[]){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
            }
        if(dp[n]!=-1){
            return dp[n];
        }
        else{
            dp[n] = stepcount(n-1,dp)+stepcount(n-2,dp);
            return dp[n];
        }
    }
}
