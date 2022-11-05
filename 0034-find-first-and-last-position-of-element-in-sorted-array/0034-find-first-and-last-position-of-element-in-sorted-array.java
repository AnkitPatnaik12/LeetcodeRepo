class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0,high=nums.length-1,mid=0;
        int a[]={-1,-1};
        while(low<=high)
        {
             mid=low+(high-low)/2;
             if(nums[mid]==target&&(mid==0||nums[mid-1]!=target))
             {
                 a[0]=mid;
                 break;
             }
             else if(nums[mid]==target||nums[mid]>target)
             {
                 high=mid-1;
             }
             else{
                 low=mid+1;
             }
        }
        low=0;
        high=nums.length-1;
         while(low<=high)
        {
             mid=low+(high-low)/2;
             if(nums[mid]==target&&(mid==nums.length-1||nums[mid+1]!=target))
             {
                 a[1]=mid;
                 break;
             }
             else if(nums[mid]==target||nums[mid]<target)
             {
                low=mid+1;
             }
             else{
                 high=mid-1;
             }
        }
        return a;
        
        
    }
}