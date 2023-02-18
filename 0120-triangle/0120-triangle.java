class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row=triangle.size();
        int col=row;
        int dp[][]=new int[row][row];
        for (int[] r: dp)
            Arrays.fill(r, -1);
        return calc(0,0,triangle,row,dp);
        
        
    }
    public int calc(int row,int col,List<List<Integer>> trg,int n,int dp[][])
    {   if(row==n-1)
          return trg.get(row).get(col);
     if(dp[row][col]!=-1)
         return dp[row][col];
        int down=calc(row+1,col,trg,n,dp)+trg.get(row).get(col);
        int downside=calc(row+1,col+1,trg,n,dp)+trg.get(row).get(col);
        return dp[row][col]=Math.min(down,downside);
    }
        
}