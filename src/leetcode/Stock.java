package leetcode;

public class Stock {

    static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int lowestPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - lowestPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
            lowestPrice = Math.min(lowestPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,4,1}));
    }
}
