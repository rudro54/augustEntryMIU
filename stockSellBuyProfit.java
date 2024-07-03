public class stockSellBuyProfit {

    public static int stockSellBuyProfitMethod(int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(stockSellBuyProfitMethod(new int[] { 7, 1, 5, 3, 6, 4 }));

        System.out.println(stockSellBuyProfitMethod(new int[] { 7, 6, 4, 3, 1 }));
    }

}
