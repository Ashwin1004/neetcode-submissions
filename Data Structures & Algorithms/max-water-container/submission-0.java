class Solution {
    public int maxArea(int[] heights) {


        int n= heights.length;

        int l=0;
        int r=n-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            int width = r - l;
            int h = Math.min(heights[l], heights[r]);
            max = Math.max(max, width * h);

            if(heights[l]< heights[r]){
                l++;
            }else{
                r--;
            }
        }

        return max;
        
    }
}
