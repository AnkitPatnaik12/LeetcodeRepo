class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        subs(res,new ArrayList<>(),0,nums);
        return res;
    }
    public void subs(List<List<Integer>> res,List<Integer> arr,int i,int[] nums)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        subs(res,arr,i+1,nums);
        arr.remove(arr.size()-1);
        subs(res,arr,i+1,nums);
    }

    
}