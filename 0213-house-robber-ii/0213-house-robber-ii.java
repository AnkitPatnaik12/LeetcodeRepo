class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
          return nums[0];
        int sum1=adjsum(nums,0,nums.length-2);
        int sum2=adjsum(nums,1,nums.length-1);
        return Math.max(sum1,sum2);
        
    }
    public int adjsum(int[] nums,int start,int end)
    {
        int inc=nums[start];
        int enc=0;
        for(int i=start+1;i<=end;i++)
        {
            int pick=nums[i]+enc;
            int nonpick=Math.max(enc,inc);
            inc=pick;
            enc=nonpick;
        }
        return Math.max(inc,enc);
    }
}