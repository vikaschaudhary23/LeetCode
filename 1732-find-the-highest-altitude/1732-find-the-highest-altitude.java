class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,sum=0;
        // for(int i=0;i<gain.length;i++){
        //     max = Math.max(gain[i])
        // }
        for(int i:gain){
            sum+=i;
            max = Math.max(max,sum);
        }
        return max;
    }
}