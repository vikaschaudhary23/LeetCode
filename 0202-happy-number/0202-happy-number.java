class Solution {
    public boolean isHappy(int n) {
        List<Integer> l = new ArrayList<>();
        while(n!=1){
            int temp=n;
            n=0;
            while(temp>0){
                n = n+(int)Math.pow((temp%10),2);
                temp/=10;
            }
            if(l.contains(n))
                return false;
            else
                l.add(n);
        }
        return true;
    }
}