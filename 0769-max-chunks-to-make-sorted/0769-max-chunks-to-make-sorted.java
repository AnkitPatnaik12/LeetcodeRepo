class Solution {
    public int maxChunksToSorted(int[] arr) {
        int total=0,counter=0,max=Integer.MIN_VALUE,i=0;
        while(i<arr.length)
        {
           
    
             if(arr[i]>max)
            {
             max=arr[i];   
            
            }
            if(i==max)
            {
                total++;
            }
             i++;   
                
        }
        return total;
    }
}