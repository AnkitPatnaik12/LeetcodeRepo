class Solution {
    public int majorityElement(int[] nums) {
        int count=1,majority=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==majority)
            {
                count++;
            }
            else
            {
                if(count-1==0)
                {
                    majority=nums[i];
                    count=1;
                        
                    
                }
                else
                {
                    count--;
                }
            }
        }
            int c=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==majority)
                    c++;
            }
           
                return majority;
        }
    }
