class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0,sum=0;
        for(int i=0;i<weights.length;i++)
        {
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int res=0,low=max,high=sum;
        while(low<=high)
        {
            int mid=(high+low)>>1;
            int cur=0,d=1;
            for(int w:weights)
            {
                if(cur+w>mid)
                {
                    d++;
                    cur=0;
                    
                }
                cur=cur+w;
            }
            if(d>days)
                low=mid+1;
            else
            {   res=mid;
                high=mid-1 ;
            }
            
        }
        return res;
    }
}