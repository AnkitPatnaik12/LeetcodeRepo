class NumMatrix {
      int mat[][]=new int[1][1];
      int pres[][]=new int[1][1];
    public NumMatrix(int[][] matrix) {
       mat=matrix;
       int presum[][]=new int[mat.length][mat[0].length];
       presum(mat,presum);
       pres=presum;                                   
    }
    public void presum(int mat[][],int presum[][])
    {    
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {   
                presum[i][j]+=mat[i][j]+(i>0?presum[i-1][j]:0);
            }
        }
         for(int i=0;i<mat.length;i++)
         {
            for(int j=0;j<mat[0].length;j++)
            {   
                presum[i][j]+=(j>0?presum[i][j-1]:0);
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=pres[row2][col2];
        if(row1>0)
        {
            sum=sum-pres[row1-1][col2];
        }
        if(col1>0)
        {
            sum=sum-pres[row2][col1-1];
        }
        if(row1>0&&col1>0)
        {
            sum=sum+pres[row1-1][col1-1];
        }
        return sum;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */