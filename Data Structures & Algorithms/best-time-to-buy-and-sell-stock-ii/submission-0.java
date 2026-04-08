class Solution {
    public int maxProfit(int[] prices) {
        int buytime = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buytime) {
                // sell today
                maxProfit += prices[i] - buytime;
            }
            // always update buytime to today (buy again)
            buytime = prices[i];
        }

        return maxProfit;
    }
}
