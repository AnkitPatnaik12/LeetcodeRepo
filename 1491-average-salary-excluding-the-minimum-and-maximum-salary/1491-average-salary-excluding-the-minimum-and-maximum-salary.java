class Solution {
    public double average(int[] salary) {
        double average=0,sum=0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++)
        {
            sum+=salary[i];
        }
        average=sum/(salary.length-2);
        return average;

    }
}