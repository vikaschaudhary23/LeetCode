class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> s = new Stack<>();
        for(int i:asteroids){
            while(!s.isEmpty() && i<0 && s.peek()>0){
                int sum = s.peek() + i;
                if(sum<0) s.pop();
                else if(sum>0) i=0;
                else {
                    s.pop();
                    i=0;
                }
            }
            if(i!=0) s.push(i);
        }
        System.out.println(s);
        int arr[] = new int[s.size()];
        int i=arr.length-1;
        while(!s.isEmpty()){
            arr[i] = s.peek();
            s.pop();
            i--;
        }
        return arr;
    }
}