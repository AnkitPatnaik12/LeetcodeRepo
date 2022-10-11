class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0,count=0;
        for(int i=0;i<sentences.length;i++)
        {  
          count=(sentences[i].split(" ")).length;
          max=Math.max(count,max);
        }
        return max;
        

    }
}