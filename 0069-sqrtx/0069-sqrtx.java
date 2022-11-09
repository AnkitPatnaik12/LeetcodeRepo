class Solution {
    public int mySqrt(int x) {
        if(x==0)
            return x;
        if(x<4)
            return 1;
        int low=0,high=x;
        int res=0;
        while(low<=high)
        {
            int mid=(low+high)>>1;
            if(mid==x/mid)
            {
                return mid;
            }
            else if(mid>x/mid)
            {
                high=mid-1;
            }
            else
            {
                res=mid;
                low=mid+1;
            }
            
        }
        return res;
    }
}