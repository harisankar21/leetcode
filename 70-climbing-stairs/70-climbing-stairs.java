class Solution {
    public int climbStairs(int n) {
        n=n+1;
        int n3=0;
        int n1=0;
        int n2=1;
        if(n==0){
            return 0;
        }
        else if(n==1){
             return 1;
         }
        else {
            for(int i=2;i<=n;++i){
                n3=n1+n2;
                n1=n2;
                n2=n3;
                
            }
        }
        return n3;
        
    }
    
}