class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        int p=1;
        int a=1;
        int count=0;
        for(int j=0;j<32;j++)
        {   count=0;
            for(int i=0;i<nums.length;i++)
            {
                if((nums[i]&a)!=0)
                {
                    count++;
                }
                
            }
            if(count%3!=0)
            {
                sum=sum+p;
            }
           p=p*2;
           a=a<<1;
           
        }
        return sum;
      
        
    }
    
}