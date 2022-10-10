class Solution {
    public int trap(int[] height) {
       int leftmax[]=new int[height.length];
       int rightmax[]=new int[height.length];
        int water=0;
       for(int i=1;i<height.length;i++)
       {
           leftmax[i]=Math.max(leftmax[i-1],height[i-1]);
       }
       for(int i=height.length-2;i>=0;i--)
       {
           rightmax[i]=Math.max(rightmax[i+1],height[i+1]);
       }
       for(int i=0;i<height.length;i++){
           int windviheight=Math.min(leftmax[i],rightmax[i])-height[i];
           water=water+(windviheight>0?windviheight:0);
       }
        return water;
           
    }
}