class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        per(res,new ArrayList<>(),nums);
        return res;
        
    }
    public void per(List<List<Integer>> res,List<Integer> list,int[]nums)
    {
        if(list.size()==nums.length)
        {
            res.add(new ArrayList<>(list));
        }
        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            per(res,list,nums);
            list.remove(list.size()-1);
            
        }
    }
}