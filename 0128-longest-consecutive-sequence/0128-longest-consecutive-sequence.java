class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
       HashSet<Integer> hs=new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
           hs.add(nums[i]);
           
       }
        int max=1,curnum=0,len=0;
        for(int num:hs)
        {
            if(!hs.contains(num-1))
            {   curnum=num;
                len=1;
                while(hs.contains(curnum+1))
                {
                    curnum+=1;
                    len++;
                }
              max=Math.max(max,len);
            }
        }
        return max;
    }
}