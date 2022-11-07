class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        Arrays.sort(piles);
        int high=piles[piles.length-1],res=0;
        while(low<=high)
        {
            int mid=(high+low)>>1;
            long hour=0;
            for(int pile:piles)
            {   hour+=pile/mid;
                if (pile % mid!= 0)
                  hour++;
            }
            if(hour>h)
            {
                low=mid+1;
            }
            else
            {
                res=mid;
                high=mid-1;
            }
        }
        return res;
        
    }
}