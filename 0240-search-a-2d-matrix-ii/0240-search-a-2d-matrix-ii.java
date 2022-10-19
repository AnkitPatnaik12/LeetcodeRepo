class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int bottom=mat.length,left=mat[0].length;
        for(int i=0;i<mat.length;i++)
        {   if(mat[i][0]==target)
                 return true;
            if(mat[i][0]>target)
            {
                bottom=i;
                break;
            }
        }
        for(int i=0;i<mat[0].length;i++)
        {   if(mat[0][i]==target)
                 return true;
            if(mat[0][i]>target)
            {
                left=i;
                break;
            }
        }
        for(int i=0;i<bottom;i++)
        {
            for(int j=0;j<left;j++)
            {
                if(mat[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}