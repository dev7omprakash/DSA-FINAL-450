public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int stock[] = { 7, 1, 3, 5, 3, 7 };
        System.out.println(maxProfit(stock));
    }

    public static int maxProfit(int[] stock) {
        int minStock = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] < minStock) {
                minStock = stock[i];
            } else if ((stock[i] - minStock) > profit) {
                profit = stock[i] - minStock;
            }
        }
        return profit;
    }
}
