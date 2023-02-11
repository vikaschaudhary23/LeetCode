class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Collections.reverseOrder()); 

        for(int i :stones){
            queue.add(i);
        } 

        while(!queue.isEmpty()){
            int x=queue.poll();
            if(queue.isEmpty()){
                return x;
            }
            int y=queue.poll();

            queue.add(x-y);
        }
        return queue.poll();
    }
}