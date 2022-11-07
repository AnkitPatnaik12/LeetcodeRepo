class Solution {
    public int maximum69Number (int num) {
        String s=""+num;
        int i=0;
        while(i<s.length()&&s.charAt(i)!='6')
        {
            i++;
            
        }
        if(i<s.length())
            s=s.substring(0,i)+"9"+s.substring(i+1,s.length());
        return Integer.parseInt(s);
    }
}