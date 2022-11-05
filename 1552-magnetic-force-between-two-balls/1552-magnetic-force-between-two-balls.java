class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1,high=position[position.length-1]-position[0],res=0;
        while(low<=high)
        {
            int mid=(low+high)>>1;
            if(distributionpos(position,mid,m))
            {
                res=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            
        }
        return res;
    }
    public boolean distributionpos(int position[],int min,int m) 
    {
        int pos=position[0],count=1;
        for(int i=1;i<position.length;i++)
        {
            if(position[i]-pos>=min)
            {
                pos=position[i];
                count++;
            }
            if(count==m)
                return true;
        }
        return false;
    }
}