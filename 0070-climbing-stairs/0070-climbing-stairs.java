class Solution {
    public int climbStairs(int n) {
        
    int[] dp = new int[n + 1];
    for (int i = 0; i < n + 1; i++) {
      dp[i] = -1;
    }
    climb(n, dp);
    return dp[n];
        
    }
    public int climb(int n,int dp[])
    {
        if(n<=1)
            return dp[n]=1;
        if(dp[n]!=-1)
          return dp[n];
        int ways=climb(n-2,dp)+climb(n-1,dp);
        dp[n]=ways;
        return ways;
        
            
    }
}