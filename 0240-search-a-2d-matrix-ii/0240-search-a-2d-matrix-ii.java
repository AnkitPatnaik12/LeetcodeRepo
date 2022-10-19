class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int j=mat[0].length-1;
        int i=0;
         while(i >= 0 && i < mat.length && j >= 0 && j < mat[0].length){
          if(target<mat[i][j])j--;
          else if(target>mat[i][j])i++;
          else if(target==mat[i][j])return true;   
                 
        }
        return false;
    }
}