class Solution {
    public int removeDuplicates(int[] nums) {
          final int k = 2;

    		//check if it is an empty array
    		if(nums.length == 0) return 0;

    		//start pointer of new array
    		int m = 1;

    		// count the time of duplicate numbers occurence
    		int count = 1;

    		for(int i = 1; i < nums.length; ++i) {
    			if(nums[i] == nums[i - 1]) {
    				if(count < k) {
    					nums[m++] = nums[i];
    				}
    				count++;
    			} else {
    				count = 1;
    				nums[m++] = nums[i];
    			}
    		}
    		return m;
           
    }
}