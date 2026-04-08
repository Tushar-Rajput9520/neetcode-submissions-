class Solution {
    public int maxProfit(int[] prices) {
        // int buytime=Integer.MAX_VALUE;
        // int maxprofit=0;
        // for(int i=0;i<prices.length;i++){
        //     if(buytime>prices[i]){
        //         buytime=prices[i];
        //     }else{
        //         int profit=prices[i]-buytime;
        //         maxprofit=Math.max(maxprofit,profit);
        //     }
        // }
        // return maxprofit;
        // int res=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         res=Math.max(res,prices[j]-prices[i]);
        //     }

        // }
        // return res;
        int maxProfit=0;
        int minBuy=prices[0];
        for(int sell:prices){
            maxProfit=Math.max(maxProfit,sell-minBuy);
            minBuy=Math.min(minBuy,sell);
        }
    return maxProfit;

        
    }
}
