class Solution {
    public int trap(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int leftMax=0;
        int rightMax=0;
        int ans=0;
        
        while(left<right){
            if(arr[left]<arr[right]){
 //               System.out.println("arr[left]<arr[right]");
                if(arr[left]>leftMax){
//                    System.out.println("arr[left]>leftMax");
                    leftMax=arr[left];
                }else{
                    ans+=(leftMax-arr[left]);
 //                   System.out.println("ans1 ="+ans);
                }
                left++;
            }else{
//                System.out.println("else major");
                if(arr[right]>rightMax){
 //                    System.out.println("arr[right]>rightMax");
                    rightMax=arr[right];
                }else{
                    ans+=(rightMax-arr[right]);
//                    System.out.println("ans2 ="+ans);
                }
                right--;
            }
        }
        
        return ans;

        
    }
}