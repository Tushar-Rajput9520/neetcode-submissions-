class Solution {
    public int maxProfit(int[] prices) {
        int buytime=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buytime>prices[i]){
                buytime=prices[i];
            }else{
                int profit=prices[i]-buytime;
                maxprofit=Math.max(maxprofit,profit);
            }
        }
        return maxprofit;

        
    }
}
