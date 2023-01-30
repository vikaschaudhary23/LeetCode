class Solution {
    public int dis(int[] a, int x2, int y2){
        int x1 = a[0], y1 = a[1];
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
    public int nearestValidPoint(int x, int y, int[][] points) {
        int n = points.length;
        boolean flag=false;
        int index=0,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(points[i][0]==x || points[i][1]==y){
                flag=true;
                if(dis(points[i],x,y)<min) {
                    min = dis(points[i],x,y);
                    index=i;
                }
            }
        }
        if(flag==false) return -1;

        return index;
    }
}