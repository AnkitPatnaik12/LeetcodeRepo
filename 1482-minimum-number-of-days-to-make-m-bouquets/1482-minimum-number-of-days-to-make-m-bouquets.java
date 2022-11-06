class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long a=(long)(m)*(long)(k);
        if(a>bloomDay.length)
            return -1;
        int low=0,high=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            low=Math.min(bloomDay[i],low);
            high=Math.max(high,bloomDay[i]);
        }
        int res=0;
        while(low<=high)
        {
            int mid=(high+low)>>1;
            int m1=0,k1=0;
            for(int day:bloomDay)
            {
                if(day<=mid)
                {
                    k1+=1;
                }
                else
                {
                    k1=0;
                }
                if(k1==k)
                {
                    m1+=1;
                    k1=0;
                }
              
            }
              if(m1>=m)
                {   res=mid;
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
        }
        return res;
        
    }
}