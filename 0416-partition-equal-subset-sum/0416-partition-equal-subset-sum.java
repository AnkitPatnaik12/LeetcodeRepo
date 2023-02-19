class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum%2!=0)
            return false;
        sum=sum/2;
        boolean dp[][]=new boolean[nums.length+1][sum+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(j==0)
                {
                    dp[i][j]=true;
    
                }
                if(j!=0&&i==0)
                    dp[i][j]=false;
                else
                {
                if(i!=0&&nums[i-1]<=j)
                {
                    if(j-nums[i-1]>=0&&dp[i-1][j-nums[i-1]]==true)
                        dp[i][j]=true;
                }
                }
                if(i!=0&&dp[i-1][j]==true)
                    dp[i][j]=true;
                    
                    
            }
        }
        return dp[nums.length][sum];
        
        
    }
}