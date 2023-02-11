class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for (int[] row: dp)
            Arrays.fill(row, -1);
        return paths(0,0,m,n,dp);
    }
    public int paths(int i,int j,int m,int n,int dp[][])
    {
        if(i<0||j<0||i==m||j==n)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(i==m-1&&j==n-1)
           return dp[m-1][n-1]=1;
        int total=paths(i+1,j,m,n,dp)+paths(i,j+1,m,n,dp);
        dp[i][j]=total;
        return dp[i][j];
    }
}