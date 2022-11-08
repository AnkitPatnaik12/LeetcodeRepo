class Solution {
    public int minSwaps(int[] nums) {
        int ones=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                ones++;
        }
        int insub=0;
        for(int i=0;i<ones;i++)
        {
         if(nums[i]==1)
             insub++;
        }
        int min=ones-insub;
        int j=0;
        for(int i=ones;i<nums.length+ones;i++)
        {   
            if(nums[i%nums.length]==1)
                insub++;
            if(nums[j%nums.length]==1)
                insub--;
            j++;
            min=Math.min(min,ones-insub);
        }
        	
        return min;
    }
}