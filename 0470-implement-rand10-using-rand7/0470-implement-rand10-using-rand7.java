/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int res=7*(rand7()-1)+rand7();
        if(res>40)
        {
            res=rand10();
        }
        else
        {
            res=(res-1)%10+1;
        }
        return res;
    }
}