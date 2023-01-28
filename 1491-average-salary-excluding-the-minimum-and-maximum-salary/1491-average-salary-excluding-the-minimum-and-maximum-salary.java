class Solution {
    public double average(int[] salary) {
        // Arrays.sort(salary);
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum=0,l=salary.length-2;
        for(int i:salary){
            if(i<min)
                min=i;
            if(i>max)
                max=i;
            sum+=i;
        }
        int num = (sum-min-max);
        double avg = (double)num/l;
        return avg;
    }
}