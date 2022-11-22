class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high)
        {
            while(low<high&&nums[low]%2==0)
            {
                low++;
            }
            while(low<high&&nums[high]%2!=0)
            {
                high--;
            }
            if(low<high)
            {
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
                high--;
                low++;
            }
        }
        return nums;
    }
}