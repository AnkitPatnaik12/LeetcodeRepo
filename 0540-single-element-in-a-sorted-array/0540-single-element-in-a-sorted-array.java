class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-1,k=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if((mid==0||nums[mid]!=nums[mid-1])&&(mid==nums.length-1||nums[mid]!=nums[mid+1]))
            {
                k=nums[mid];
                break;
            }
            else
            {
                if(mid%2==0)
                {
                    if(mid!=nums.length-1&&nums[mid+1]==nums[mid])
                    {
                        low=mid+1;
                    }
                    else
                    {
                        high=mid-1;
                    }
                }
                else
                {
                    if(mid!=0&&nums[mid-1]==nums[mid])
                    {
                        low=mid+1;
                    }
                    else
                    {
                        high=mid-1;
                    }
                }
            }
        }
        return k;
    }
}