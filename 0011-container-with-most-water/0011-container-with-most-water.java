class Solution {
    public int maxArea(int[] height) {
      int low=0,high=height.length-1,n=height.length-1,max=0;
      while(low<high)
      {
          max=Math.max(max,Math.min(height[low],height[high])*n);
          if(height[low]<height[high])
          {
              low++;
          }
          else
          {
              high--;
          }
          n--;
          
      }
        return max;
    }
}