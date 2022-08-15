class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length-1;
        int sell=0,buy=0,i=0;
        int profit=0;
        while(i<n){
            while(i<n && prices[i+1]<=prices[i]){
               ++i;
            }
             buy=prices[i];
            while(i<n && prices[i+1]>prices[i]){
               ++i; 
            }
            sell=prices[i];
            profit=profit+(sell-buy);
            
        }
        return profit;
    }
}