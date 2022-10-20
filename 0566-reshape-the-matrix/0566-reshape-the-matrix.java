class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((r*c)!=(mat.length*mat[0].length))
            return mat;
        int res[][]=new int[r][c];
        Queue<Integer> a=new LinkedList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
              a.add(mat[i][j]);
            }
        }
        for(int i=0;a.size()>0&&i<r;i++)
        {
           for(int j=0;a.size()>0&&j<c;j++)
          {
             res[i][j]=a.poll();
          }
        }
        return res;
    }
}