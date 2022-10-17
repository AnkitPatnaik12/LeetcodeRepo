class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cad1=Integer.MIN_VALUE;
        int cad2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==cad1)
            {
                count1++;
                
            }
            else if(nums[i]==cad2)
            {
                count2++;
            }
            else if(count1==0)
            {
                cad1=nums[i];
                count1++;
            }
            else if(count2==0)
            {
                cad2=nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==cad1)
            {
                c1++;
            }
            else if(nums[i]==cad2){
                c2++;
            }
        }
        List<Integer> res=new ArrayList<>();
        if(c1>(nums.length/3))
            res.add(cad1);
        if(c2>(nums.length/3))
            res.add(cad2);
        return res;
                    
                    
            
    }
}