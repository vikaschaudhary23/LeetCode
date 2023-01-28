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

        double avg = (double)(sum-min-max)/l;
        return avg;
    }
}