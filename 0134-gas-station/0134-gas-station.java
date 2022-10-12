class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gas1=0,prevgas=0,start=0,x=0,count=0;
         int sum = 0, n = gas.length;
        for(int i=0;i<n;i++) {
            sum += gas[i]-cost[i];
        }
        if(sum < 0) return -1;
        while(start<gas.length)
        {   
            if(cost[x]>gas[x]+prevgas)
            {   
                start=x+1;
                x=start;
                count=0;
                prevgas=0;
            }
            else
            {
                gas1=gas[x]+prevgas-cost[x];
                prevgas=gas1;
                count++;
                x=(x+1)%gas.length;
            }
            if(count==gas.length)
                return start;
        }
        return -1;
    }
}