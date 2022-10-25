class Solution {
    public int findGCD(int[] nums) {
        int a=-1,b=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            a=Math.max(nums[i],a);
            b=Math.min(nums[i],b);
        }
        return gcd(b,a);
    }
    public int gcd(int a,int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}