class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=1,sum=Integer.MIN_VALUE,count=0;
        while(i<nums.length-1&&j<nums.length)
        {
            if(nums[j]-nums[i]==k&&nums[i]+nums[j]!=sum)
            {
                count++;
                sum=nums[i]+nums[j];
                i++;
                j++;
            }
            else if(nums[j]-nums[i]<k)
            {
                j++;
            }
            else
            {
                i++;
            }
            if(i==j)
                j++;
        }
            return count;
    }
}