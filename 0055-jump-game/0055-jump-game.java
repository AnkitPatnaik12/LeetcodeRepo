class Solution {
    public boolean canJump(int[] nums) {
        boolean ifpossible[]=new boolean[nums.length];
        ifpossible[nums.length-1]=true;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]==0)
            {
                ifpossible[i]=false;
            }
            else
            {
                for(int j=1;j<=nums[i];j++)
                {
                    if((i+j)<nums.length);
                    {
                        if(ifpossible[i+j]==true)
                        {
                            ifpossible[i]=true;
                            break;
                        }
                    }
                }
            }
        }
        return ifpossible[0];
        
    }
}