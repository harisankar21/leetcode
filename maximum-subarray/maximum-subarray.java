class Solution {
    public int maxSubArray(int[] nums) {
        int l=nums.length;
        int s=0;
        int e=0;
        int maxsoFar=nums[0];
        int maxendhere=nums[0];
        for(int i=1;i<l;++i){
            if(nums[i]>maxendhere+nums[i]){
                s=i;
                maxendhere=nums[i];
            }else{
                maxendhere=nums[i]+maxendhere;
               
            }
            if(maxsoFar<maxendhere){
                 e=i;
                maxsoFar=maxendhere;
            }
        }
      
        return maxsoFar;
    }
}