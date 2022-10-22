class Solution {
    public int countPrimes(int n) {
        boolean sievenotprime[]=new boolean[n];
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(sievenotprime[i]==false)
            {
                count++;
                for(int j=2;i*j<n;j++)
                {
                    sievenotprime[i*j]=true;
                }
            }
        }
        return count;
    }
}