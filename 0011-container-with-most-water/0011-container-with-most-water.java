class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ma=0;
        while(l<r){
            int min= Math.min(height[l],height[r]);
            int w= r-l;
            int ca=w*min;
            if(ca>ma){
                ma=ca;
            }
            if(height[l]<height[r]){
             ++l;
            }
            else{
                --r;
            }
        }
        return ma;
        
    }
}