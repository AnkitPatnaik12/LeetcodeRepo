class Solution {
    public int subarraySum(int[] nums, int k) {
            HashMap<Integer,Integer> hs=new HashMap<>();
            int prefix=0;
            int count=0;
            hs.put(0,1);
            for(int i=0;i<nums.length;i++)
            {   prefix=prefix+nums[i];
                if(hs.containsKey(prefix-k))
                {
                    count=count+hs.get(prefix-k);
                }
               if(hs.containsKey(prefix))
               {
                   hs.put(prefix,hs.get(prefix)+1);
                   
               }
               else
               {
                   hs.put(prefix,1);
               }
               
            }
        return count;
            
    }
}