class Solution {
    public int maximum69Number (int num) {
        int arr[]=new int[5];
        int p=num;
        for(int i=4;i>=0;i--)
        {
            arr[i]=p%10;
            p=p/10;
        }
        for(int i=0;i<5;i++)
        {
            if(arr[i]!=0&&arr[i]==6)
            {   arr[i]=9;
                break;
            }
        }
        int res=0;
        for(int i=0;i<5;i++)
        {
            if(arr[i]!=0)
                res=res*10+arr[i];
        }
        return res;
    }
        
}