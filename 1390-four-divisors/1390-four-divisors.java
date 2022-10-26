class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0,divisor=0;
        for(int n:nums)
        {   divisor=0;
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {  if(divisor==0)
                    divisor=i;
                   else
                   {
                       divisor=0;
                       break;
                   }    
                    
                }
            }
           if(divisor>0&&(divisor!=n/divisor))
              {
                sum+=1+n+divisor+n/divisor;  
              }
        }
        return sum;
    }
}