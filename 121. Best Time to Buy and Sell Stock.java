class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) 
            return 0;
        
        int[] minBuyPrice = new int[prices.length];
        minBuyPrice[0] = prices[0];
        int maxProfit = 0;
        int currentProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= minBuyPrice[i-1]) {
                minBuyPrice[i] = prices[i];
            } else {
                minBuyPrice[i] = minBuyPrice[i-1];
            }
            
            currentProfit = prices[i] - minBuyPrice[i];
            maxProfit = (currentProfit > maxProfit) ? currentProfit : maxProfit;
        }
        
        return maxProfit;
    }
}

//Time -> O(N)
//Space -> O(N)


Dynamic Programming
