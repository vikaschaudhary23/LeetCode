class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        if(n==1) return 1;
        int l=0,r=n-1, ans=0;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                l++;
                r--;
                ans++;
            }
            else{
                r--;
                ans++;
            }
        }
        return ans;
    }
}