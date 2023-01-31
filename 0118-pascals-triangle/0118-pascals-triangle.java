class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> dp0 = new ArrayList<>();
        dp0.add(1);
        pascal.add(dp0);
        if(numRows==1)
            return pascal;
        List<Integer> dp1 = new ArrayList<>();
         dp1.add(1); dp1.add(1);
        pascal.add(dp1);
        if(numRows==2)
            return pascal;
        for (int index = 2; index < numRows; index++) {
            List<Integer> dp = new ArrayList<>();
            dp.add(1);
            for (int j = 1; j < index; j++) {
                dp.add(pascal.get(index-1).get(j-1)+pascal.get(index-1).get(j));
            }
            dp.add(1);
            pascal.add(dp);
        }
        return pascal;
        
        
    }
}